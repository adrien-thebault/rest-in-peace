REST IN PEACE
=============

L'extension des fichiers contenant des programmes écrit avec notre DSL est ".rip"  du nom du projet "Rest In Peace".

Chaque fichier correspondra à la description d'une API.

Il doit donc contenir les paramètres :
- **"host :"** suivi du nom de l'hôte,
- **"port :"** suivi du numéro de port
- **"commands :"** suivi de la liste des commandes REST.

Une commande REST doit s'écrire de la forme **"nom :"** suivi des paramètres ci-dessous :
- **"method :"** suivi du verbe REST correspondant,
- **"path :"** suivi de l'URI
- **"entryFormats :"** suivi de la liste des formats d'entrée (séparateur "-")
- **"outputFormats :"** suivi de la liste des formats de sortie (séparateur "-"")
- **"description :"** suivi de la description de la commande
- **"parameters :"** suivi de la liste des paramètres (séparateur "-")

Un paramètre doit s'écrire de la forme :
- **"name :"** suivi du nom du paramètre,
- **"type :"** suivi du type du paramètre (string, int)
- **"description :"** suivi de la description du paramètre


Un exemple de modèle est donné ci-dessous :


	host:localhost
	port:8080
	commands:
	getArticle:
		method: GET
		path: "/article/{id}/"
		entryFormats:
			- "application/json"
	  		- "application/xml"
	  	outputFormats:
	  		- "application/json"
	  		- "application/xml"
	  	description: "Get info about an article"
	  	parameters:
	  		-  	name: id
	  			type: int
	  			description: "Id of the article"
	  	response:
	  		- 404:
	  			description: "The article with this id does not exists"
	putArticle:
		method: PUT
		path: "/article"
		entryFormats:
			- "application/json"
	  		- "application/xml"
	  	outputFormats:
	  		- "application/json"
	  		- "application/xml"
	  	description: "Add an article"
	  	parameters:
	  		-  	name: id
	  			type: int
	  			description: "Id of the article"
	  		- 	name: "name"
	  			type: string
	  			description: "The name of the article"
	  	response:
	  		- 404:
	  			description: "The article with this id does not exists"
