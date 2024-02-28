package com.microsoft.graph.beta.models.networkaccess;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class RelatedWebCategory extends RelatedResource implements Parsable {
    /**
     * Instantiates a new {@link RelatedWebCategory} and sets the default values.
     */
    public RelatedWebCategory() {
        super();
        this.setOdataType("#microsoft.graph.networkaccess.relatedWebCategory");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link RelatedWebCategory}
     */
    @jakarta.annotation.Nonnull
    public static RelatedWebCategory createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RelatedWebCategory();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("webCategoryName", (n) -> { this.setWebCategoryName(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the webCategoryName property value. The webCategoryName property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getWebCategoryName() {
        return this.backingStore.get("webCategoryName");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("webCategoryName", this.getWebCategoryName());
    }
    /**
     * Sets the webCategoryName property value. The webCategoryName property
     * @param value Value to set for the webCategoryName property.
     */
    public void setWebCategoryName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("webCategoryName", value);
    }
}
