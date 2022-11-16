Class {
	#name : #Xbox,
	#superclass : #Consola,
	#instVars : [
		'game'
	],
	#category : #Consola
}

{ #category : #accessing }
Xbox >> game [
	^ game
]

{ #category : #accessing }
Xbox >> game: aString [
	game := aString
]

{ #category : #accessing }
Xbox >> price [
	^ price - 2
]
