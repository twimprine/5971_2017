# 5971_2017

Please following best practices for pushing code changes to this repository.
Disclaimer: Use standard Git commands to perform actions. Detailed Documentation for that can be found
here. https://git-scm.com/

1.      Master: Stable Version \Production Top and main branch.   
Nobody should be pushing to this branch but one person to avoid messing up the production code.     

Only staging branch will have rights to push to it. In case of hot-fix on a development branch with fix can be merged and pushed to it. (Only by the executives and Senior Developers)

2.      Staging Branch: Beta Testing, Testing environment.     
Only development branch (Alpha testing branch) should be pushing to this branch.

It gets code updates from development branch.

3. Development Branch (Usually called integration in the four tier architecture) (alpha testing branch)
 It gets codes from individual developer’s branch.  It is the branch for hot-fixes.(Happens once we complete a cycle and have another development branch as current version of application)  Branch is unstable (Can break as developers are constantly merging to it.)     

 
4.Individual Branches (Usually called development in the four tier architecture)
Each developer works on their individual branch.
    
5.Merging Steps 
Merge codes from development to your own branch.    

Fix any issues you encounter after the merge    

Merge your branch to development

Push both branches to git server.

How to start working on project that is already setup? 
Clone the repository in your machine.   

Checkout development branch to your new branch.

#Steps to make changes.

git add . &&
git commit -am "comment"&&
git checkout Development && 
git pull origin Development && 
git merge Development_dinesh && 
git push origin Development&&
git checkout Development_dinesh&&
git merge Development &&
git push origin Development_dinesh
