
def gitDownload(repo)
{
git "https://github.com/intelliqittrainings/${repo}.git"
}

def mavenBuild()
{
 sh 'mvn package'
}


def tomcatDeploy(jobname,ip,contextpath)
{

sh "scp /var/lib/jenkins/workspace/${jobname}/webapp/target/webapp.war ubuntu@${ip}:/var/lib/tomcat9/webapps/${contextpath}.war"

}
