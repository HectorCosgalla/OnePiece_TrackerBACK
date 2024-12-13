# ONE PIECE tracker

A personal project that has the  goal to help me to track which volumes of the One Piece manga i have in my collection.

## how to navigate through this
This was thought to be a mono repo so here you could find a lot of branches and each one of them has a purpose:

* The **master** branch will work as read only since i will be using other branches to implement it.
* The branches **BackEnd** and **FrontEnd** will be their respective implementations.
    1. For minor features, they will be uploaded directly to the implementations...
    2. The procedure for major updates will be the folowwing:
        1. I will create a new branch with the name of which "end" i need to update. E.g. I need to do the major update in the backend, I will create a branch called `backend_test_<update_name>`, there the readme will be a summarize of the changes that I want to achieve in that update.
        2. Once I'm 100% sure I like what I see I will merge the `_test` branch with their respective "`main`"
    3. For now, both implementations will run locally but i hope with time and effort launch it so anyone could use it!

#### IT WASN'T A MINOR FEATURE! NOW WHAT!?
---
Sometimes happens that we just want to "change" the background color of something and after doing the change everything just falls, well, if something like that happens will surely meant the "major update" will be the worst thing I have ever coded and all the money i have spend so far in learning has been a waste :weary: but if that happens here's what to do:
1. We will move one commit back the branch and we will create a new branch called `TICKETXXXX` where the `XXXX` represents the numbers from `0000` to `9999`.
2. Inside that will have the next template:
    ```
    # Ticket #XXXX

    **Failed:**
    * {list of features that broke after the update}

    **Successful:**
    * {list of features that are fixed}
    ```
3. As the code gets fixed the template will be modified and once I love what I see the template must end looking like this:
    ```
    # Ticket #XXXX

    **Features fixed:**
    * {list of features that got fixed}
    ```
4. Then, we just merge it to the "`main`" branch and we act like that never hapenned (Only the "Tickets.csv", that will be only in the **master** branch `/Docs` path, will be updated with a small resume of what what happened)


***Side note:***
All those proceadures would be just for now until I decide to try to autimatize everything through github actions cause there must be a way to do it, but I want to focus in adapting myself to that way of working for now...