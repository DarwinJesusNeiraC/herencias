Class {
	#name : #Carro,
	#superclass : #Object,
	#instVars : [
		'time'
	],
	#category : #Producto
}

{ #category : #accessing }
Carro >> time [
	^ time / 5
]

{ #category : #accessing }
Carro >> time: aNumber [
	time := aNumber 
]
