def call(Map stageParams) {
    checkout([
        $class: 'GitSCM', 
        branches: [[name: '*/master']], 
        extensions: [], 
        userRemoteConfigs: [[url: 'https://github.com/johnpaul-mani/outsource.git']]])
}
