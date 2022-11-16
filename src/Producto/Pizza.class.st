Class {
	#name : #Pizza,
	#superclass : #Object,
	#instVars : [
		'time'
	],
	#category : #Producto
}

{ #category : #accessing }
Pizza >> time [
	^ time + 10
]

{ #category : #accessing }
Pizza >> time: aNumber [
	time := aNumber 
]
