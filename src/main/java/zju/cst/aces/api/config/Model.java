package zju.cst.aces.api.config;

import java.util.Arrays;
import java.util.stream.Collectors;

public enum Model {
    GPT_3_5_TURBO("gpt-3.5-turbo", new ModelConfig.Builder()
            .withModelName("gpt-3.5-turbo")
            .withUrl("https://api.gptsapi.net/v1/chat/completions")
            .withContextLength(4096)
            .withTemperature(0.5)
            .withFrequencyPenalty(0)
            .withPresencePenalty(0)
            .build()),
    GPT_3_5_TURBO_1106("gpt-3.5-turbo-1106", new ModelConfig.Builder()
            .withModelName("gpt-3.5-turbo-1106")
            .withUrl("https://api.gptsapi.net/v1/chat/completions")
            .withContextLength(16385)
            .withTemperature(0.5)
            .withFrequencyPenalty(0)
            .withPresencePenalty(0)
            .build()),
    GPT_4O("gpt-4o", new ModelConfig.Builder()
            .withModelName("gpt-4o")
            .withUrl("https://api.gptsapi.net/v1/chat/completions")
            .withContextLength(122880) //120k
            .withTemperature(0.5)
            .withFrequencyPenalty(0)
            .withPresencePenalty(0)
            .build()),
    GPT_4O_MINI("gpt-4o-mini", new ModelConfig.Builder()
            .withModelName("gpt-4o-mini")
            .withUrl("https://api.gptsapi.net/v1/chat/completions")
            .withContextLength(122880) //120k
            .withTemperature(0.5)
            .withFrequencyPenalty(0)
            .withPresencePenalty(0)
            .build()),
    GPT_4O_MINI_0718("gpt-4o-mini-2024-07-18", new ModelConfig.Builder()
            .withModelName("gpt-4o-mini-2024-07-18")
            .withUrl("https://api.gptsapi.net/v1/chat/completions")
            .withContextLength(10922) //120k
            .withTemperature(0.5)
            .withFrequencyPenalty(0)
            .withPresencePenalty(0)
            .build()),
    CODE_LLAMA("code-llama", new ModelConfig.Builder()
            .withModelName("code-llama")
            .withUrl(null)
            .withContextLength(16385)
            .withTemperature(0.5)
            .withFrequencyPenalty(0)
            .withPresencePenalty(0)
            .build()),
    // 添加更多模型
    CODE_QWEN("codeqwen:v1.5-chat", new ModelConfig.Builder()
            .withModelName("codeqwen:v1.5-chat")
            .withUrl(null)
            .withContextLength(16385)
            .withTemperature(0.5)
            .withFrequencyPenalty(0)
            .withPresencePenalty(0)
            .build()),
    QWEN_MAX("qwen-max", new ModelConfig.Builder()
            .withModelName("qwen-max")
            .withUrl(null)
            .withContextLength(16385)
            .withTemperature(0.5)
            .withFrequencyPenalty(0)
            .withPresencePenalty(0)
            .build()),
    QWEN_PLUS("qwen-plus", new ModelConfig.Builder()
            .withModelName("qwen-plus")
            .withUrl(null)
            .withContextLength(1000000)
            .withTemperature(0.5)
            .withFrequencyPenalty(0)
            .withPresencePenalty(0)
            .build()),
    QWEN_CODER_PLUS("qwen-coder-plus", new ModelConfig.Builder()
            .withModelName("qwen-coder-plus")
            .withUrl(null)
            .withContextLength(1000000)
            .withTemperature(0.5)
            .withFrequencyPenalty(0)
            .withPresencePenalty(0)
            .build()),
    DOU_BAO("doubao-1-5-pro-256k-250115", new ModelConfig.Builder()
            .withModelName("doubao-1-5-pro-256k-250115")
            .withUrl(null)
            .withContextLength(1000000)
            .withTemperature(0.5)
            .withFrequencyPenalty(0)
            .withPresencePenalty(0)
            .build()),
    DEEP_SEEK("deepseek-v3-250324", new ModelConfig.Builder()
            .withModelName("deepseek-v3-250324")
            .withUrl(null)
            .withContextLength(16385)
            .withTemperature(0.5)
            .withFrequencyPenalty(0)
            .withPresencePenalty(0)
            .build()),
    GEMINI("gemini-2.5-pro-exp-03-25", new ModelConfig.Builder()
            .withModelName("gemini-2.5-pro-exp-03-25")
            .withUrl(null)
            .withContextLength(16385)
            .withTemperature(0.5)
            .withFrequencyPenalty(0)
            .withPresencePenalty(0)
            .build());


    private final String modelName;
    private final ModelConfig defaultConfig;

    Model(String modelName, ModelConfig defaultConfig) {
        this.modelName = modelName;
        this.defaultConfig = defaultConfig;
    }

    public String getModelName() {
        return modelName;
    }

    public ModelConfig getDefaultConfig() {
        return defaultConfig;
    }

    public static Model fromString(String modelName) {
        for (Model model : Model.values()) {
            if (model.getModelName().equalsIgnoreCase(modelName)) {
                return model;
            }
        }
        throw new IllegalArgumentException("No Model with name " + modelName +
                "\nSupport models: " + Arrays.stream(Model.values()).map(Model::getModelName).collect(Collectors.joining(", ")));
    }


}
