class ParenthesisGenerator:
    def __init__(self, n):
        self.n = n
        self.result = []

    def generate(self):
        self._backtrack("", 0, 0)
        return self.result

    def _backtrack(self, curr, open_count, close_count):
        if len(curr) == 2 * self.n:
            self.result.append(curr)
            return
        if open_count < self.n:
            self._backtrack(curr + '(', open_count + 1, close_count)
        if close_count < open_count:
            self._backtrack(curr + ')', open_count, close_count + 1)

# Example usage
if __name__ == "__main__":
    generator = ParenthesisGenerator(3)
    print(generator.generate())
