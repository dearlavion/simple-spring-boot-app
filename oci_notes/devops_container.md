---
Docker
---
To log in
docker login iad.ocir.io
username: ocuocictrng13/98764968-lab.user07
pashword: token


To push
git tag imageID iad.ocir.io/ocuocictrng13/repo-name:tag
git push iad.ocir.io/ocuocictrng13/repo-name:tag

---
Kubernetes
---
kubeclt cluster-info
kubeclt version
kubeclt api-resources
kubeclt api-versions

kubeclt create -f file.yml
kubeclt create deployment NAME --image=nginx:tag --replicas=#
kubectl create namespace NAME

kubeclt apply -f file.yml

kubeclt get pods
kubeclt get pods -l app=nginx
kubeclt get all --all-namespaces
kubeclt get pod NAME -o yaml > my-pod.yml

kubeclt describe pod PODNAME
kubeclt describe pod -l label=VALUE
kubeclt logs -f PODNAME
kubeclt exec PODNAME -- COMMAND
kubeclt exec -it PODNAME -- /bin/bash
kubeclt edit pod NAME

kubeclt get deployments
kubeclt get deployment NAME -o yaml
kubeclt scale deployment NAME --replicas=#
kubeclt rollout status deployment/NAME
kubeclt set image deployment/NAME nginx=nginx:label
kubeclt edit deployment NAME

kubeclt get service
kubeclt expose deployment/NAME --name=my-app --port=80
kubeclt expose deployment/NAME --name=my-app --port=80 --target-port=80 --type=NodePort
kubeclt expose deployment/NAME --name=my-app --port=80 --target-port=80 --type=LoadBalancer
kubeclt get nodes -o wide

kubeclt config view
kubeclt config get-contexts
kubeclt config current-contexts
kubeclt config use-context name
kubeclt get events

kubeclt delete -f file.yml
kubeclt delete pods,services -l label=value
kubeclt delete pods --all
kubeclt delete deployment name
kubeclt delete namespace name

kubeclt get nodes
kubeclt describe nodes | grep Allocated -A -S
kubeclt get pods -o wide | grep node-name