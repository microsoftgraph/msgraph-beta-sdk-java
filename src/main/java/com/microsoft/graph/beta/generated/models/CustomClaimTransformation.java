package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.store.BackedModel;
import com.microsoft.kiota.store.BackingStore;
import com.microsoft.kiota.store.BackingStoreFactorySingleton;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CustomClaimTransformation implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link CustomClaimTransformation} and sets the default values.
     */
    public CustomClaimTransformation() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CustomClaimTransformation}
     */
    @jakarta.annotation.Nonnull
    public static CustomClaimTransformation createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.containsTransformation": return new ContainsTransformation();
                case "#microsoft.graph.endsWithTransformation": return new EndsWithTransformation();
                case "#microsoft.graph.extractAlphaTransformation": return new ExtractAlphaTransformation();
                case "#microsoft.graph.extractMailPrefixTransformation": return new ExtractMailPrefixTransformation();
                case "#microsoft.graph.extractNumberTransformation": return new ExtractNumberTransformation();
                case "#microsoft.graph.extractTransformation": return new ExtractTransformation();
                case "#microsoft.graph.ifEmptyTransformation": return new IfEmptyTransformation();
                case "#microsoft.graph.ifNotEmptyTransformation": return new IfNotEmptyTransformation();
                case "#microsoft.graph.joinTransformation": return new JoinTransformation();
                case "#microsoft.graph.regexReplaceTransformation": return new RegexReplaceTransformation();
                case "#microsoft.graph.startsWithTransformation": return new StartsWithTransformation();
                case "#microsoft.graph.substringTransformation": return new SubstringTransformation();
                case "#microsoft.graph.toLowercaseTransformation": return new ToLowercaseTransformation();
                case "#microsoft.graph.toUppercaseTransformation": return new ToUppercaseTransformation();
                case "#microsoft.graph.trimTransformation": return new TrimTransformation();
            }
        }
        return new CustomClaimTransformation();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a {@link Map<String, Object>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        Map<String, Object> value = this.backingStore.get("additionalData");
        if(value == null) {
            value = new HashMap<>();
            this.setAdditionalData(value);
        }
        return value;
    }
    /**
     * Gets the backingStore property value. Stores model information.
     * @return a {@link BackingStore}
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.backingStore;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("input", (n) -> { this.setInput(n.getObjectValue(TransformationAttribute::createFromDiscriminatorValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the input property value. The input attribute that provides the source for the transformation. This parameter is required if it&apos;s the first or only transformation in the list of transformations to be applied. Subsequent transformations use the output of the prior transformation as input.
     * @return a {@link TransformationAttribute}
     */
    @jakarta.annotation.Nullable
    public TransformationAttribute getInput() {
        return this.backingStore.get("input");
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.backingStore.get("odataType");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("input", this.getInput());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.backingStore.set("additionalData", value);
    }
    /**
     * Sets the backingStore property value. Stores model information.
     * @param value Value to set for the backingStore property.
     */
    public void setBackingStore(@jakarta.annotation.Nonnull final BackingStore value) {
        Objects.requireNonNull(value);
        this.backingStore = value;
    }
    /**
     * Sets the input property value. The input attribute that provides the source for the transformation. This parameter is required if it&apos;s the first or only transformation in the list of transformations to be applied. Subsequent transformations use the output of the prior transformation as input.
     * @param value Value to set for the input property.
     */
    public void setInput(@jakarta.annotation.Nullable final TransformationAttribute value) {
        this.backingStore.set("input", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
}
