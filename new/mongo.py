client = pymongo.MongoClient("mongodb+srv://shady:shady@cluster0.iqmqp.mongodb.net/?retryWrites=true&w=majority", server_api=ServerApi('1'))
db = client.test
