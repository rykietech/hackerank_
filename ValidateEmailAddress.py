import re
"""'([A-Za-z0-9\-\_]+@[a-zA-Z0-9]+\.[a-zA-Z0-9-.]{1,3}$) username@websitename.extension format type.'
where [A-Za-z0-9\-\_]  used for the username which can only letters, digits, dashes and underscores
      [a-zA-Z0-9] used for the website name  which can only have letters and digits
      [a-zA-Z0-9-.]used for the extension
      {1,3} The max length of the extension was 3
"""
email_regex = re.compile('([A-Za-z0-9\-\_]+@[a-zA-Z0-9]+\.[a-zA-Z0-9-.]{1,3}$)')
def fun(s):
    # return True if s is a valid email, else return False
    if email_regex.match(s):        #checks where the email (s) matches with the format in line 8
      return True                   #If there is a match returns true,else returns false.
    else:
      return False

def filter_mail(emails):
    return list(filter(fun, emails))

if __name__ == '__main__':
    n = int(input())
    emails = []
    for _ in range(n):
        emails.append(input())

filtered_emails = filter_mail(emails)
filtered_emails.sort()
print(filtered_emails)
