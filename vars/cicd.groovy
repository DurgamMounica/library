
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

sh 'scp /var/lib/jenkins/workspace/${jobnamme}/webapp/target/webapp.war ubuntu@${ip}:/var/lib/tomcat9/webapps/${contextpath}.war'

}
