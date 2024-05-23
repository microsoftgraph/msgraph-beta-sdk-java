package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class RegexReplaceTransformation extends CustomClaimTransformation implements Parsable {
    /**
     * Instantiates a new {@link RegexReplaceTransformation} and sets the default values.
     */
    public RegexReplaceTransformation() {
        super();
        this.setOdataType("#microsoft.graph.regexReplaceTransformation");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link RegexReplaceTransformation}
     */
    @jakarta.annotation.Nonnull
    public static RegexReplaceTransformation createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RegexReplaceTransformation();
    }
    /**
     * Gets the additionalAttributes property value. Additional attributes that can be referenced within the replacement string.
     * @return a {@link java.util.List<SourcedAttribute>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<SourcedAttribute> getAdditionalAttributes() {
        return this.backingStore.get("additionalAttributes");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("additionalAttributes", (n) -> { this.setAdditionalAttributes(n.getCollectionOfObjectValues(SourcedAttribute::createFromDiscriminatorValue)); });
        deserializerMap.put("regex", (n) -> { this.setRegex(n.getStringValue()); });
        deserializerMap.put("replacement", (n) -> { this.setReplacement(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the regex property value. The regular expression to be applied on the input directory attribute or constant.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getRegex() {
        return this.backingStore.get("regex");
    }
    /**
     * Gets the replacement property value. The transformation output replacement pattern with regular expression output group and input parameter group reference.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getReplacement() {
        return this.backingStore.get("replacement");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("additionalAttributes", this.getAdditionalAttributes());
        writer.writeStringValue("regex", this.getRegex());
        writer.writeStringValue("replacement", this.getReplacement());
    }
    /**
     * Sets the additionalAttributes property value. Additional attributes that can be referenced within the replacement string.
     * @param value Value to set for the additionalAttributes property.
     */
    public void setAdditionalAttributes(@jakarta.annotation.Nullable final java.util.List<SourcedAttribute> value) {
        this.backingStore.set("additionalAttributes", value);
    }
    /**
     * Sets the regex property value. The regular expression to be applied on the input directory attribute or constant.
     * @param value Value to set for the regex property.
     */
    public void setRegex(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("regex", value);
    }
    /**
     * Sets the replacement property value. The transformation output replacement pattern with regular expression output group and input parameter group reference.
     * @param value Value to set for the replacement property.
     */
    public void setReplacement(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("replacement", value);
    }
}
