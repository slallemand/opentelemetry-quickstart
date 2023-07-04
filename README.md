# opentelemetry-quickstart

This project uses Quarkus, the Supersonic Subatomic Java Framework.

If you want to learn more about Quarkus, please visit its website: https://quarkus.io/ .


## Create Namespace my-app
```
oc new-project my-app
```

## Deploy Jaeger Tracing using CRD (operator)
```
oc apply -f Jaeger.yaml
```

## Deploy OpenTelemetry Collector using CRD (operator)

Configuration for dynatrace and jaeger will be deployed.

```
oc apply -f OpenTelemetryCollector-dynatrace-jaeger.yaml
```

## Deploy the quarkus app
```
./mvnw install -Dquarkus.kubernetes.deploy=true -Dquarkus.kubernetes-client.trust-certs=true -Dquarkus.openshift.route.expose=true  -Dquarkus.openshift.route.tls.termination=edge -Dquarkus.openshift.route.tls.insecure-edge-termination-policy=Redirect
```