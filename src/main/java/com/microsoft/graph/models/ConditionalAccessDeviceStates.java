package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ConditionalAccessDeviceStates implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** States excluded from the scope of the policy. Possible values: Compliant, DomainJoined. */
    private java.util.List<String> excludeStates;
    /** States in the scope of the policy. All is the only allowed value. */
    private java.util.List<String> includeStates;
    /** The OdataType property */
    private String odataType;
    /**
     * Instantiates a new conditionalAccessDeviceStates and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ConditionalAccessDeviceStates() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a conditionalAccessDeviceStates
     */
    @javax.annotation.Nonnull
    public static ConditionalAccessDeviceStates createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ConditionalAccessDeviceStates();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the excludeStates property value. States excluded from the scope of the policy. Possible values: Compliant, DomainJoined.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getExcludeStates() {
        return this.excludeStates;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("excludeStates", (n) -> { this.setExcludeStates(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("includeStates", (n) -> { this.setIncludeStates(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the includeStates property value. States in the scope of the policy. All is the only allowed value.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getIncludeStates() {
        return this.includeStates;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfPrimitiveValues("excludeStates", this.getExcludeStates());
        writer.writeCollectionOfPrimitiveValues("includeStates", this.getIncludeStates());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the excludeStates property value. States excluded from the scope of the policy. Possible values: Compliant, DomainJoined.
     * @param value Value to set for the excludeStates property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setExcludeStates(@javax.annotation.Nullable final java.util.List<String> value) {
        this.excludeStates = value;
    }
    /**
     * Sets the includeStates property value. States in the scope of the policy. All is the only allowed value.
     * @param value Value to set for the includeStates property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIncludeStates(@javax.annotation.Nullable final java.util.List<String> value) {
        this.includeStates = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this.odataType = value;
    }
}
