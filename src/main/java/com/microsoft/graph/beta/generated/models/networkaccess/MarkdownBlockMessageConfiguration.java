package com.microsoft.graph.beta.models.networkaccess;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MarkdownBlockMessageConfiguration extends BlockPageConfigurationBase implements Parsable {
    /**
     * Instantiates a new {@link MarkdownBlockMessageConfiguration} and sets the default values.
     */
    public MarkdownBlockMessageConfiguration() {
        super();
        this.setOdataType("#microsoft.graph.networkaccess.markdownBlockMessageConfiguration");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link MarkdownBlockMessageConfiguration}
     */
    @jakarta.annotation.Nonnull
    public static MarkdownBlockMessageConfiguration createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MarkdownBlockMessageConfiguration();
    }
    /**
     * Gets the body property value. The body property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getBody() {
        return this.backingStore.get("body");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("body", (n) -> { this.setBody(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("body", this.getBody());
    }
    /**
     * Sets the body property value. The body property
     * @param value Value to set for the body property.
     */
    public void setBody(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("body", value);
    }
}
