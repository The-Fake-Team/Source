1. Create your own branch
```Console
    git branch your_branch_name             # create new branch (you should name it : yourName_purposeOfThisBranch . Ex : tung_createControllers)
    git switch your_branch_name             # use that branch 
    git push -u origin your_branch_name     # make new branch on remote repo
```
 2. Get update from main branch
```Console
    git switch your_branch_name     # make sure you are on right branch 
    git pull origin main            # update with remote main repo
    git merge origin/main           # get master update
```
 2. Commit your work    
```Console
    git add your_updated_files              # add changes to next commit, use `.` to include all files  
    git commit -m 'commit_messsage'         # commit changes from previous `git add`, commit_message should include good info : `finish some_function`, `fix some_bug`
    git push origin your_branch_name        # push changes to remote
```
 3. Delete your old branch after finish your work
```Console
    git switch main                     # go away from deleting branch
    git branch -d old_branch_name       # delete it
```
