# Prompt logbook

Each member keeps their own file in this folder, named after them: for example `ana-g.md` for
Ana García. Nobody edits another member's file, so Git never has two people changing the same
file.

Every prompt you send to any AI goes in, in the order you sent it: the ones that worked, the
ones that failed and the ones you rejected. If you then fixed the code by hand, say so in the
same entry. Write each entry when you send the prompt, not at the end: the dates have to match
your commits.

Never put a password, a key or personal data in a prompt. If it happens, write `[hidden]` in its
place in the logbook and say so in "What happened": that is the only change allowed to a prompt.

Copy this block for each entry. The ID is your initials and a number that goes up by one.

```markdown
## AG-07

- **Date and time:** 2026-11-03 18:40
- **Author:** Ana García
- **Tool:** Gemini in Android Studio (Agent) | Claude chat
- **Files touched:** app/src/main/java/com/example/notesbysubject/...
- **Result:** accepted | accepted with changes | rejected | failed
- **How I checked it:** what you ran or tapped, and what you saw

### Prompt

The prompt exactly as you wrote it, without fixing it afterwards.

### What happened

What the AI changed, what went wrong if anything, and what you did about it. If you rejected
it or fixed it by hand, describe the change.
```

The rubric (block B) marks four things: that every prompt is there and in order, that each
entry has all the fields, that rejections and fixes are recorded with the change described, and
that the logbook matches the commit history. A made-up or retouched logbook is a matter of
academic integrity, not of marks.
