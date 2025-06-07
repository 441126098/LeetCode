class LRUCache:

    def __init__(self, capacity: int):
        self.capacity = capacity
        self.value = {}
        self.list = []
        

    def get(self, key: int) -> int:
        if key in self.value:
            val = self.value[key]
            self.list.remove(key)
            self.list.append(key)
            return val
        return -1

    def put(self, key: int, value: int) -> None:
        if key in self.value:
            self.list.remove(key)
        elif len(self.value) >= self.capacity:
            old_key = self.list.pop(0)
            del self.value[old_key]
        self.list.append(key)
        self.value[key] = value