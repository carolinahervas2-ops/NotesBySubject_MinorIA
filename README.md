# Notes by Subject

Group project, app 1. With your timetable saved, every photo of the board or of your notes goes to the folder of the subject you have at that time.

This README is yours. Fill it in as you go: it is part of your submission, and the rubric marks it. If this README and the rubric ever disagree, the rubric wins. How to open the project, what the skeleton already does and a route to build the app are in the skeleton's document, `MAI_SAP_Skeleton_App1_NotesBySubject.docx`.

## How to run it

Write what someone needs to run your app from a fresh copy of the repository, besides the steps in the skeleton's document. For example: how to create an account in the app, or what to tap first. Never write a password here or anywhere else in the repository.

## Real call or recorded file (A5)

Say how to switch between the real call to the timetable and the recorded file, and which of the two the app uses as you submit it.

## Coverage table

One row for each row of block A. A row that is not in this table scores 0.

| Row | Feature | Files | Screen |
|---|---|---|---|
| A1 | | | |
| A2 | | | |
| A3 | | | |
| A4 | | | |
| A5 | | | |
| A6 | | | |
| A7 | | | |
| A8 | | | |
| A9 | | | |
| A10 | | | |

## Design decisions

Three decisions you took, each with its reason.

1.
2.
3.

## Release (C2)

Which key signs your `.aab`, where you keep it outside the repository, and why Google Play does not accept the debug key.

Sign it in Android Studio with **Build > Generate Signed Bundle/APK**, then **Android App Bundle**. The `.aab` that Gradle builds on its own in `app/build/outputs` is not signed, and an unsigned `.aab` scores 0 in C2.

## Facts you cannot guess

Keep this section as it is. It is section 10 of the skeleton's document, copied here so that Gemini can read it while it works on your project.

### A5 · The timetable

No key. The recorded file, `app/src/main/assets/recorded/timetable.json`, is the same as this address:

```text
https://cunef-mia-sap-proyecto.vercel.app/data/app1/timetable.json
```

The JSON has `note`, a list `subjects` and a list `slots`:

| Field | What it holds |
|---|---|
| `note` | A sentence about the data. You do not need it. |
| `subjects[].id` | A short code such as `MOB`. The slots point to it. |
| `subjects[].name` | The subject's name. |
| `subjects[].color` | A colour as text: `#1A1F6C`. |
| `slots[].id` | A number that never repeats. |
| `slots[].subjectId` | The `id` of its subject. |
| `slots[].dayOfWeek` | 1 is Monday and 7 is Sunday. |
| `slots[].start`, `slots[].end` | Local time in Madrid, as text with two digits for the hour: `09:00`. |
| `slots[].room` | The room, or `null` when it is not known yet. |

Two cases are awkward on purpose. One slot has `"room": null`, and one subject, `SEM`, has no slots, so no time ever matches it. Decide what your app shows in both.

Careful with `dayOfWeek`. Android's `java.util.Calendar` counts from Sunday, so its `DAY_OF_WEEK` is 2 on a Monday. `java.time.DayOfWeek.getValue()` counts 1 for Monday and 7 for Sunday, like the file.

### Fields you do not read

The file has `note`, which your classes may not declare. With the plain `Json`, the app closes on the first field it does not know. Create `val lenientJson = Json { ignoreUnknownKeys = true }` (Session 8 Guide, section 3.7) and use it in both places where JSON is read: `lenientJson.asConverterFactory(...)` in your `Retrofit.Builder()`, and `lenientJson.decodeFromString(...)` where you read the recorded file. Section 7.3 of the same Guide explains the errors a call can bring back.

### A2 and A8 · Saving and sharing a photo

A photo saved in the app's internal files has no address that another app can open, so sharing its path does not work. Save each photo under `filesDir/notes/`, for example in `notes/<subject id>/`: it is the only folder the skeleton's FileProvider exposes. To share one, build its `content://` address with `FileProvider.getUriForFile(context, "${context.packageName}.fileprovider", file)`, put it in a sharing `Intent`, and add `Intent.FLAG_GRANT_READ_URI_PERMISSION` so that the other app may read it. The authority is `${applicationId}.fileprovider`, as declared in `AndroidManifest.xml`. FileProvider is not in any Guide: ask Gemini, and check what it writes against Android's reference, `https://developer.android.com/reference/androidx/core/content/FileProvider`.

### A8 · Where the photos live

The photos stay on the phone, in the internal files. Firebase Storage needs the paid Blaze plan, and the project must cost nothing.

### A6 · What is shared

Share the timetable with your classmates through Firestore. The photos are not shared.

### A7 · The reminder

WorkManager does not run at an exact time: Android picks the moment (Session 10 Guide, section 1.6), so the reminder may arrive a few minutes late. A periodic task repeats every 15 minutes at the very least (Session 10 Guide, section 3.4).

### A9 · The level

Use the accelerometer while the camera screen is open, so that the person sees whether the phone is straight before taking the photo.

### A10 · Text Recognition

The library is the bundled one, `com.google.mlkit:text-recognition` version 16.0.1, already in the catalog as `libs.text.recognition`. Do not swap it for `play-services-mlkit-text-recognition`: with an older Google Play services, the confidence comes back as 0 (Session 12 Guide, section 2.3). As in Session 12, read the text of a saved photo (Session 12 Guide, section 4.8) and use each element's `confidence`, a number between 0 and 1 (section 6.1). A word with a low confidence should not count as a match.

### In the emulator

For the camera, edit the virtual device in Device Manager and set the back camera to Webcam0, your laptop's webcam. It must be free, so close Teams or Zoom. A webcam rarely shows a board with text: test the recognition on a phone, or with a photo you saved. For the accelerometer, open the emulator's extended controls, Virtual sensors, and move the pretend phone. Test A7 and A8 on an emulator with Android 13 or later.

### Call the real file from home

The class shares one internet address. In class, use the recorded file.
