package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ConditionalAccessDevices implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Filter that defines the dynamic-device-syntax rule to include/exclude devices. A filter can use device properties (such as extension attributes) to include/exclude them. Cannot be set if includeDevices or excludeDevices is set. */
    private ConditionalAccessFilter _deviceFilter;
    /** States excluded from the scope of the policy. Possible values: Compliant, DomainJoined. Cannot be set if deviceFIlter is set. */
    private java.util.List<String> _excludeDevices;
    /** The excludeDeviceStates property */
    private java.util.List<String> _excludeDeviceStates;
    /** States in the scope of the policy. All is the only allowed value. Cannot be set if deviceFIlter is set. */
    private java.util.List<String> _includeDevices;
    /** The includeDeviceStates property */
    private java.util.List<String> _includeDeviceStates;
    /** The OdataType property */
    private String _odataType;
    /**
     * Instantiates a new conditionalAccessDevices and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ConditionalAccessDevices() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.conditionalAccessDevices");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a conditionalAccessDevices
     */
    @javax.annotation.Nonnull
    public static ConditionalAccessDevices createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ConditionalAccessDevices();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this._additionalData;
    }
    /**
     * Gets the deviceFilter property value. Filter that defines the dynamic-device-syntax rule to include/exclude devices. A filter can use device properties (such as extension attributes) to include/exclude them. Cannot be set if includeDevices or excludeDevices is set.
     * @return a conditionalAccessFilter
     */
    @javax.annotation.Nullable
    public ConditionalAccessFilter getDeviceFilter() {
        return this._deviceFilter;
    }
    /**
     * Gets the excludeDevices property value. States excluded from the scope of the policy. Possible values: Compliant, DomainJoined. Cannot be set if deviceFIlter is set.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getExcludeDevices() {
        return this._excludeDevices;
    }
    /**
     * Gets the excludeDeviceStates property value. The excludeDeviceStates property
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getExcludeDeviceStates() {
        return this._excludeDeviceStates;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final ConditionalAccessDevices currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(6);
        deserializerMap.put("deviceFilter", (n) -> { currentObject.setDeviceFilter(n.getObjectValue(ConditionalAccessFilter::createFromDiscriminatorValue)); });
        deserializerMap.put("excludeDevices", (n) -> { currentObject.setExcludeDevices(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("excludeDeviceStates", (n) -> { currentObject.setExcludeDeviceStates(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("includeDevices", (n) -> { currentObject.setIncludeDevices(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("includeDeviceStates", (n) -> { currentObject.setIncludeDeviceStates(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
        return deserializerMap
    }
    /**
     * Gets the includeDevices property value. States in the scope of the policy. All is the only allowed value. Cannot be set if deviceFIlter is set.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getIncludeDevices() {
        return this._includeDevices;
    }
    /**
     * Gets the includeDeviceStates property value. The includeDeviceStates property
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getIncludeDeviceStates() {
        return this._includeDeviceStates;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this._odataType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("deviceFilter", this.getDeviceFilter());
        writer.writeCollectionOfPrimitiveValues("excludeDevices", this.getExcludeDevices());
        writer.writeCollectionOfPrimitiveValues("excludeDeviceStates", this.getExcludeDeviceStates());
        writer.writeCollectionOfPrimitiveValues("includeDevices", this.getIncludeDevices());
        writer.writeCollectionOfPrimitiveValues("includeDeviceStates", this.getIncludeDeviceStates());
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
        this._additionalData = value;
    }
    /**
     * Sets the deviceFilter property value. Filter that defines the dynamic-device-syntax rule to include/exclude devices. A filter can use device properties (such as extension attributes) to include/exclude them. Cannot be set if includeDevices or excludeDevices is set.
     * @param value Value to set for the deviceFilter property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceFilter(@javax.annotation.Nullable final ConditionalAccessFilter value) {
        this._deviceFilter = value;
    }
    /**
     * Sets the excludeDevices property value. States excluded from the scope of the policy. Possible values: Compliant, DomainJoined. Cannot be set if deviceFIlter is set.
     * @param value Value to set for the excludeDevices property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setExcludeDevices(@javax.annotation.Nullable final java.util.List<String> value) {
        this._excludeDevices = value;
    }
    /**
     * Sets the excludeDeviceStates property value. The excludeDeviceStates property
     * @param value Value to set for the excludeDeviceStates property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setExcludeDeviceStates(@javax.annotation.Nullable final java.util.List<String> value) {
        this._excludeDeviceStates = value;
    }
    /**
     * Sets the includeDevices property value. States in the scope of the policy. All is the only allowed value. Cannot be set if deviceFIlter is set.
     * @param value Value to set for the includeDevices property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIncludeDevices(@javax.annotation.Nullable final java.util.List<String> value) {
        this._includeDevices = value;
    }
    /**
     * Sets the includeDeviceStates property value. The includeDeviceStates property
     * @param value Value to set for the includeDeviceStates property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIncludeDeviceStates(@javax.annotation.Nullable final java.util.List<String> value) {
        this._includeDeviceStates = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
}
