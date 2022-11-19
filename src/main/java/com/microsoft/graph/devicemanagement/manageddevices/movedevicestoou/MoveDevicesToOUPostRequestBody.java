package com.microsoft.graph.devicemanagement.manageddevices.movedevicestoou;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to call the moveDevicesToOU method. */
public class MoveDevicesToOUPostRequestBody implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The deviceIds property */
    private java.util.List<String> _deviceIds;
    /** The organizationalUnitPath property */
    private String _organizationalUnitPath;
    /**
     * Instantiates a new moveDevicesToOUPostRequestBody and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public MoveDevicesToOUPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a moveDevicesToOUPostRequestBody
     */
    @javax.annotation.Nonnull
    public static MoveDevicesToOUPostRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MoveDevicesToOUPostRequestBody();
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
     * Gets the deviceIds property value. The deviceIds property
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getDeviceIds() {
        return this._deviceIds;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final MoveDevicesToOUPostRequestBody currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(2);
        deserializerMap.put("deviceIds", (n) -> { currentObject.setDeviceIds(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("organizationalUnitPath", (n) -> { currentObject.setOrganizationalUnitPath(n.getStringValue()); });
        return deserializerMap
    }
    /**
     * Gets the organizationalUnitPath property value. The organizationalUnitPath property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOrganizationalUnitPath() {
        return this._organizationalUnitPath;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfPrimitiveValues("deviceIds", this.getDeviceIds());
        writer.writeStringValue("organizationalUnitPath", this.getOrganizationalUnitPath());
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
     * Sets the deviceIds property value. The deviceIds property
     * @param value Value to set for the deviceIds property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceIds(@javax.annotation.Nullable final java.util.List<String> value) {
        this._deviceIds = value;
    }
    /**
     * Sets the organizationalUnitPath property value. The organizationalUnitPath property
     * @param value Value to set for the organizationalUnitPath property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOrganizationalUnitPath(@javax.annotation.Nullable final String value) {
        this._organizationalUnitPath = value;
    }
}
