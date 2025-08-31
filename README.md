
---
OCI SSH Auth Token
---
1. Generate token with your valid oracle email address
 >  ssh-keygen -t rsa -f $HOME/.ssh/mysshkey -C "shayebaisac@gmail.com"

2. convert to PEM
 >  ssh-keygen -f mysshkey.pub -e -m pkcs8

Example output

>-----BEGIN PUBLIC KEY-----
Something here
-----END PUBLIC KEY-----

3. Copy it to your profile > API key to register the fingerprint token

4. Create config file in .ssh/

>Host devops.scmservice.*.oci.oraclecloud.com
User 98764968-lab.user15@ocuocictrng13
IdentityFile ~/.ssh/mysshkey


---
Clone by Code Repository
---
1. Create a Repo in Devos project

2. Clone any repo from git in OCI shell (Ex. post-pilot-service)
> $ git clone REPO

> $ cd post-pilot-service/

> $ git config user.email "dearlavion@gmail.com"

> $ git config user.name "dearlavion"

> $ git remote add devops ssh://devops.scmservice.us-ashburn-1.oci.oraclecloud.com/namespaces/ocuocictrng13/projects/baish-devops-project/repositories/baish-post-pilot

> $ git push devops main --force


---
Clone by Mirror
---
1. Add token to your github
>https://github.com/settings/tokens/new

Enable all scope for now, will generate some random fingerprint
>rwfwgwefw

Add it as secret to OCI VAult
