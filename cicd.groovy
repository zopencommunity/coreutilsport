node('linux') 
{
        stage ('Poll') {
                checkout([
                        $class: 'GitSCM',
                        branches: [[name: '*/main']],
                        doGenerateSubmoduleConfigurations: false,
                        extensions: [],
                        userRemoteConfigs: [[url: 'https://github.com/ZOSOpenTools/coreutilsport.git']]])
        }

        stage('Build') {
                build job: 'Port-Pipeline', parameters: [string(name: 'PORT_GITHUB_REPO', value: 'coreutilsport'), string(name: 'PORT_DESCRIPTION', value: 'The GNU Core Utilities are the basic file, shell and text manipulation utilities of the GNU operating system.' )]
        }
}
