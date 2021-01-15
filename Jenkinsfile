withEnv([
    'PORT="320002"']) {
    Microservice(
        name: 'test-habeeb',
        domainName: 'test-habeeb',
        namespace: 'acquiring-microservice',
        production: true,
        cpu: "200m",
        type: "java",
        port: "320002",
        memory: "512",
        database: true,
        serviceTesting: true,
        contractTesting: true,
        deployPR: false,
        vpcAccess: false,
        publiclyAccessible: false,
        commonFlags: "--set service.port=${PORT} \
              --set probes.liveness.enabled=true \
              --set probes.liveness.path=/info \
              --set probes.liveness.initialDelaySeconds=180 \
              --set probes.liveness.failureThreshold=1 \
              --set probes.liveness.timeoutSeconds=10 \
              --set probes.readiness.enabled=true \
              --set probes.readiness.path=/info \
              --set probes.readiness.initialDelaySeconds=200 \
              --set probes.readiness.failureThreshold=1 \
              --set probes.readiness.timeoutSeconds=10",
        qaFlags: "",
        prodFlags: ""
    )
}
