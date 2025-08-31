
---
OCI SSH Auth Token
---
1. Generate token with your valid oracle email address
 >  ssh-keygen -t rsa -f $HOME/.ssh/mysshkey -C "shayebaisac@gmail.com"

2. convert to PEM
 >  ssh-keygen -f mysshkey.pub -e -m pkcs8

Example output

>-----BEGIN PUBLIC KEY-----
MIIBojANBgkqhkiG9w0BAQEFAAOCAY8AMIIBigKCAYEAmt235DSYn3C+dQzVrB5t
Lp51WauhitVk99Jl7Dj+G3oL4r5X25Tfity2YnVjsUXTCXMcHcjaGSj+by7N89oW
vUyIOKHXh+kYE1Y+hsz1DhaENNGrAsd65V5Kl0rQEmERMJeewW9zmI+eG8O5mU6S
ax599Y9s/aoHJ/T5C7CRpYPBPMYtptB/aoq1AVEDYUkumVdNO9I/P8rXTbMcSXPE
OgVU0lm+n2KF6CkdkOeCJDihkHc01JIrsUm/MqTCQ+15kKVjkOUD8WVKXp8Uee8K
hFzWijLA8PS7QThHIQUtCbuyazBXxi8IVDQBUc4t71M2be/Kq6LAqxqY+oswZas+
nS6gGhLFQQeUEgIP+I1Cm+fNxHNo/HDu2sSkP8UxCdYIcgQKnhTR/8A9Gx9vHL5w
3h3JiR4fTXbeoO3mHAj7IWel/XGgDue8UjNZcZvQVCCjgPQHCO8Zqp0a/c9qaBWI
WZQ/brldNL07i16p8oXVgSyXk5mUc5VtJGWl+PIcBcEXAgMBAAE=
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

Enable all scope for now
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

Add it as secret to OCI VAult
