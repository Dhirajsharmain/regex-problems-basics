# regex-problems-basics

**UC1-ValidateFirstName**

_Description :_ As a User need to enter a valid First Name
- First name starts with Cap and has minimum 3 characters
  

  **UC2-ValidateLastName**

_Description :_ As a User need to enter a valid Last Name
- Last name starts with Cap and has minimum 3 characters

**UC3-ValidatingEmail**

_Description :_ As a User need to enter a valid email
- E.g. abc.xyz@bl.co.in - Email has 3 mandatory parts (abc, bl
  & co) and 2 optional (xyz & in) with
  precise @ and . positions.

**UC4-ValidatingMobileNumbers**

_Description :_ As a User need to follow pre-defined Mobile Format 
- E.g. 91 9919819801 
- Country code follow by space and 10 digit number

**UC5-PasswordRule1**

_Description :_ As a User need to follow pre-defined Password rules.

Rule1 – minimum 8 characters 
- NOTE – All rules must be passed

**UC6-PasswordRule2**

_Description :_ As a User need to follow pre-defined Password rules.

Rule2 – Should have at least 1 Upper Case - NOTE – All rules must be passed

**UC7-PasswordRule3**

_Description :_ Rule3 – Should have at least 1 numeric number in the password

**UC8-PasswordRule4**

_Description_ : Rule4 – Has exactly 1 Special Character
- NOTE – All rules must be passed

**UC9-sampleEmailsValidation**

_Description_ : Should clear all email samples provided separately.


U**C10-jUnitTestForUserEntries**

_Description_ : Write JUnit Test to validate the User Entry for First Name, Last Name, Email, Mobile, and Password.
- Write Junit Test for Happy as well as Sad test
  case.
- Happy Test Case validates the Entry Successfully
- Sad Test Cases fails the Entry

**UC11-JUnitTestForEmails**

_Description_ : Write JUnit Parameterised Test to validate multiple entry for the Email Address.

**UC12-CustomExceptions**

_Description_ : Refactor the Code to throw custom exceptions in case of Invalid User Details 
- Rewrite all Test Cases to take in Custom Exception for Invalid First Name, Last Name, Email, Mobile, and Password

**UC13-LambdaFunctionToValidate**

_Description_ : Refactor the Code to use Lambda Function to validate User Entry
- Use Lambda Function to validate First Name, Last Name, Email, Mobile, and Password