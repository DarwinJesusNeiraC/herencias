Class {
	#name : #Consola,
	#superclass : #Object,
	#instVars : [
		'price'
	],
	#category : #Consola
}

{ #category : #accessing }
Consola >> price [
	^ price
]

{ #category : #accessing }
Consola >> price: aNumber [
	price := aNumber
]
