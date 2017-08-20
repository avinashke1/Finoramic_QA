import os
import sys
import pip

def install(package):

	try:
		
		pip.main(['install',package])
		return True

	except:
		print "Installation failed: %s"%package
		return False
 
def main():
	
	f=open('ReadMe.json','r')
	data=f.readlines()
	lists=data.splitlines()
 	for i in lists:
 		if not data:break
 		install(lists)


if __name__=='__main__':

	main()