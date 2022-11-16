Class {
	#name : #PlayStation,
	#superclass : #Consola,
	#instVars : [
		'color'
	],
	#category : #Consola
}

{ #category : #accessing }
PlayStation >> color [
	^ color
]

{ #category : #accessing }
PlayStation >> color: aCadena [
	color := aCadena 
]

{ #category : #accessing }
PlayStation >> price [
	^ price +1
]
