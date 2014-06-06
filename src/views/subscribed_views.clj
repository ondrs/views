(ns views.subscribed-views)

(defprotocol SubscribedViews
  ;; Subscription and Delta routing
  (subscribe-views [this sub-request])
  (unsubscribe-views [this unsub-request])
  (disconnect [this disconnect-request])
  (send-message [this address msg])
  (subscriber-key-fn [this msg])
  (prefix-fn [this msg])

  ;; DB interaction
  (broadcast-deltas [this db views-with-deltas])
  (subscribed-views [this]))
