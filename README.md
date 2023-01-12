# Chores
This program allows the user to enter a list of names and a list of chores (equal lengths). The program then assigns each person a random chore.
# Description
This program is written in Java and uses several built-in Java classes to accomplish its task. The BufferedReader class is used to read input from the user, the IOException class is used to handle input/output errors, the InputStreamReader class is used to read input from the standard input stream, the ArrayList class is used to store the names and chores, and the Collections class is used to shuffle the chores.

When the program is run, it first prompts the user to enter the number of names and corresponding chores they would like to enter. This value is stored in the "count" variable. The program then runs a loop that prompts the user to enter a name and corresponding chore, which are then added to separate ArrayLists. This loop runs the number of times specified by the "count" variable.

After all the names and chores have been entered, the program prints out the names and their corresponding chores. It then uses the shuffle method from the Collections class to randomly shuffle the chores. The program then runs another loop that prints out the names along with their shuffled, randomly assigned chores.

The program is useful for randomly assigning a list of chores to a list of names, It can be used for example in a household or an organization where chores needs to be assigned to different members of the group.
