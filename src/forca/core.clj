(ns forca.core
  (:gen-class))

;; Definindo variável total-de-vidas passando o valor 6
(def total-de-vidas 6)

;; Criando a função perdeu que não recebe parâmetros e printa
;; "Você Perdeu"
(defn perdeu [] (print "Você Perdeu"))

;; Criando a função jogo que recebe a quantidade de vidas como parâmetro
(defn jogo [vidas]
  ;; Condição dentro da função, se vidas for igual a 0
  (if (= vidas 0)
    ;; Executa a função perdeu
    (perdeu)
    ;; Senão, executa as funções passadas dentro da função do
    (do
      ;; Printa a quantidade de vidas
      (print vidas)
      ;; Chama a função jogo passando vidas - 1 como parâmetro
      ;; (dec vidas) = (- vidas 1)
      (jogo (dec vidas))
    )
  )
)

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))
