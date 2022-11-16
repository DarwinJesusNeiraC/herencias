Class {
	#name : #Edificio,
	#superclass : #Object,
	#instVars : [
		'time'
	],
	#category : #Producto
}

{ #category : #accessing }
Edificio >> time [
	^ time
]

{ #category : #accessing }
Edificio >> time: aNumber [
	time := aNumber 
]
