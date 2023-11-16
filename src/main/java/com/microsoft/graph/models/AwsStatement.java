package com.microsoft.graph.models;

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
public class AwsStatement implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    private BackingStore BackingStore;
    /**
     * Instantiates a new AwsStatement and sets the default values.
     */
    public AwsStatement() {
        this.BackingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AwsStatement
     */
    @jakarta.annotation.Nonnull
    public static AwsStatement createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AwsStatement();
    }
    /**
     * Gets the actions property value. The actions property
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getActions() {
        return this.BackingStore.get("actions");
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        Map<String, Object> value = this.BackingStore.get("additionalData");
        if(value == null) {
            value = new HashMap<>();
            this.setAdditionalData(value);
        }
        return value;
    }
    /**
     * Gets the BackingStore property value. Stores model information.
     * @return a BackingStore
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.BackingStore;
    }
    /**
     * Gets the condition property value. The condition property
     * @return a AwsCondition
     */
    @jakarta.annotation.Nullable
    public AwsCondition getCondition() {
        return this.BackingStore.get("condition");
    }
    /**
     * Gets the effect property value. The effect property
     * @return a AwsStatementEffect
     */
    @jakarta.annotation.Nullable
    public AwsStatementEffect getEffect() {
        return this.BackingStore.get("effect");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(8);
        deserializerMap.put("actions", (n) -> { this.setActions(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("condition", (n) -> { this.setCondition(n.getObjectValue(AwsCondition::createFromDiscriminatorValue)); });
        deserializerMap.put("effect", (n) -> { this.setEffect(n.getEnumValue(AwsStatementEffect.class)); });
        deserializerMap.put("notActions", (n) -> { this.setNotActions(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("notResources", (n) -> { this.setNotResources(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("resources", (n) -> { this.setResources(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("statementId", (n) -> { this.setStatementId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the notActions property value. The notActions property
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getNotActions() {
        return this.BackingStore.get("notActions");
    }
    /**
     * Gets the notResources property value. The notResources property
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getNotResources() {
        return this.BackingStore.get("notResources");
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.BackingStore.get("odataType");
    }
    /**
     * Gets the resources property value. The resources property
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getResources() {
        return this.BackingStore.get("resources");
    }
    /**
     * Gets the statementId property value. The statementId property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getStatementId() {
        return this.BackingStore.get("statementId");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfPrimitiveValues("actions", this.getActions());
        writer.writeObjectValue("condition", this.getCondition());
        writer.writeEnumValue("effect", this.getEffect());
        writer.writeCollectionOfPrimitiveValues("notActions", this.getNotActions());
        writer.writeCollectionOfPrimitiveValues("notResources", this.getNotResources());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeCollectionOfPrimitiveValues("resources", this.getResources());
        writer.writeStringValue("statementId", this.getStatementId());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the actions property value. The actions property
     * @param value Value to set for the actions property.
     */
    public void setActions(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.BackingStore.set("actions", value);
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.BackingStore.set("additionalData", value);
    }
    /**
     * Sets the BackingStore property value. Stores model information.
     * @param value Value to set for the BackingStore property.
     */
    public void setBackingStore(@jakarta.annotation.Nonnull final BackingStore value) {
        Objects.requireNonNull(value);
        this.BackingStore = value;
    }
    /**
     * Sets the condition property value. The condition property
     * @param value Value to set for the condition property.
     */
    public void setCondition(@jakarta.annotation.Nullable final AwsCondition value) {
        this.BackingStore.set("condition", value);
    }
    /**
     * Sets the effect property value. The effect property
     * @param value Value to set for the effect property.
     */
    public void setEffect(@jakarta.annotation.Nullable final AwsStatementEffect value) {
        this.BackingStore.set("effect", value);
    }
    /**
     * Sets the notActions property value. The notActions property
     * @param value Value to set for the notActions property.
     */
    public void setNotActions(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.BackingStore.set("notActions", value);
    }
    /**
     * Sets the notResources property value. The notResources property
     * @param value Value to set for the notResources property.
     */
    public void setNotResources(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.BackingStore.set("notResources", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("odataType", value);
    }
    /**
     * Sets the resources property value. The resources property
     * @param value Value to set for the resources property.
     */
    public void setResources(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.BackingStore.set("resources", value);
    }
    /**
     * Sets the statementId property value. The statementId property
     * @param value Value to set for the statementId property.
     */
    public void setStatementId(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("statementId", value);
    }
}
