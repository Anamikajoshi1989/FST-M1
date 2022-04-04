import pandas as pd

# Read the CSV file and store it into a DataFrame
dataframe = pd.read_csv("credentials.csv")

# Print the full data
print("Full Data: ")
print(dataframe)

# Print the values in the Usernames column only
print("===============")
print("Usernames:")
print(dataframe["Usernames"])

# Print the username and password of the second row
print("===============")
print("Username:" ,dataframe["Usernames"][1])
print("Passwords:" ,dataframe["Passwords"][1])

#Sort the Usernames column in ascending order
print("====================================")
print("Data sorted in ascending Usernames:")
print(dataframe.sort_values('Usernames'))

#Sort the Passwords column in descending order
print("====================================")
print("Data sorted in descending Passwords:")
print(dataframe.sort_values('Passwords', ascending=False))
