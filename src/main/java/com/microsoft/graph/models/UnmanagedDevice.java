package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Unmanaged device discovered in the network. */
public class UnmanagedDevice implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Device name. */
    private String _deviceName;
    /** Domain. */
    private String _domain;
    /** IP address. */
    private String _ipAddress;
    /** Last logged on user. */
    private String _lastLoggedOnUser;
    /** Last seen date and time. */
    private OffsetDateTime _lastSeenDateTime;
    /** Location. */
    private String _location;
    /** MAC address. */
    private String _macAddress;
    /** Manufacturer. */
    private String _manufacturer;
    /** Model. */
    private String _model;
    /** The OdataType property */
    private String _odataType;
    /** Operating system. */
    private String _os;
    /** Operating system version. */
    private String _osVersion;
    /**
     * Instantiates a new unmanagedDevice and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public UnmanagedDevice() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.unmanagedDevice");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a unmanagedDevice
     */
    @javax.annotation.Nonnull
    public static UnmanagedDevice createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UnmanagedDevice();
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
     * Gets the deviceName property value. Device name.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDeviceName() {
        return this._deviceName;
    }
    /**
     * Gets the domain property value. Domain.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDomain() {
        return this._domain;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final UnmanagedDevice currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(12);
        deserializerMap.put("deviceName", (n) -> { currentObject.setDeviceName(n.getStringValue()); });
        deserializerMap.put("domain", (n) -> { currentObject.setDomain(n.getStringValue()); });
        deserializerMap.put("ipAddress", (n) -> { currentObject.setIpAddress(n.getStringValue()); });
        deserializerMap.put("lastLoggedOnUser", (n) -> { currentObject.setLastLoggedOnUser(n.getStringValue()); });
        deserializerMap.put("lastSeenDateTime", (n) -> { currentObject.setLastSeenDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("location", (n) -> { currentObject.setLocation(n.getStringValue()); });
        deserializerMap.put("macAddress", (n) -> { currentObject.setMacAddress(n.getStringValue()); });
        deserializerMap.put("manufacturer", (n) -> { currentObject.setManufacturer(n.getStringValue()); });
        deserializerMap.put("model", (n) -> { currentObject.setModel(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
        deserializerMap.put("os", (n) -> { currentObject.setOs(n.getStringValue()); });
        deserializerMap.put("osVersion", (n) -> { currentObject.setOsVersion(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the ipAddress property value. IP address.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getIpAddress() {
        return this._ipAddress;
    }
    /**
     * Gets the lastLoggedOnUser property value. Last logged on user.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getLastLoggedOnUser() {
        return this._lastLoggedOnUser;
    }
    /**
     * Gets the lastSeenDateTime property value. Last seen date and time.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastSeenDateTime() {
        return this._lastSeenDateTime;
    }
    /**
     * Gets the location property value. Location.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getLocation() {
        return this._location;
    }
    /**
     * Gets the macAddress property value. MAC address.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMacAddress() {
        return this._macAddress;
    }
    /**
     * Gets the manufacturer property value. Manufacturer.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getManufacturer() {
        return this._manufacturer;
    }
    /**
     * Gets the model property value. Model.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getModel() {
        return this._model;
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
     * Gets the os property value. Operating system.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOs() {
        return this._os;
    }
    /**
     * Gets the osVersion property value. Operating system version.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOsVersion() {
        return this._osVersion;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("deviceName", this.getDeviceName());
        writer.writeStringValue("domain", this.getDomain());
        writer.writeStringValue("ipAddress", this.getIpAddress());
        writer.writeStringValue("lastLoggedOnUser", this.getLastLoggedOnUser());
        writer.writeOffsetDateTimeValue("lastSeenDateTime", this.getLastSeenDateTime());
        writer.writeStringValue("location", this.getLocation());
        writer.writeStringValue("macAddress", this.getMacAddress());
        writer.writeStringValue("manufacturer", this.getManufacturer());
        writer.writeStringValue("model", this.getModel());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("os", this.getOs());
        writer.writeStringValue("osVersion", this.getOsVersion());
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
     * Sets the deviceName property value. Device name.
     * @param value Value to set for the deviceName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceName(@javax.annotation.Nullable final String value) {
        this._deviceName = value;
    }
    /**
     * Sets the domain property value. Domain.
     * @param value Value to set for the domain property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDomain(@javax.annotation.Nullable final String value) {
        this._domain = value;
    }
    /**
     * Sets the ipAddress property value. IP address.
     * @param value Value to set for the ipAddress property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIpAddress(@javax.annotation.Nullable final String value) {
        this._ipAddress = value;
    }
    /**
     * Sets the lastLoggedOnUser property value. Last logged on user.
     * @param value Value to set for the lastLoggedOnUser property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastLoggedOnUser(@javax.annotation.Nullable final String value) {
        this._lastLoggedOnUser = value;
    }
    /**
     * Sets the lastSeenDateTime property value. Last seen date and time.
     * @param value Value to set for the lastSeenDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastSeenDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastSeenDateTime = value;
    }
    /**
     * Sets the location property value. Location.
     * @param value Value to set for the location property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLocation(@javax.annotation.Nullable final String value) {
        this._location = value;
    }
    /**
     * Sets the macAddress property value. MAC address.
     * @param value Value to set for the macAddress property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMacAddress(@javax.annotation.Nullable final String value) {
        this._macAddress = value;
    }
    /**
     * Sets the manufacturer property value. Manufacturer.
     * @param value Value to set for the manufacturer property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setManufacturer(@javax.annotation.Nullable final String value) {
        this._manufacturer = value;
    }
    /**
     * Sets the model property value. Model.
     * @param value Value to set for the model property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setModel(@javax.annotation.Nullable final String value) {
        this._model = value;
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
    /**
     * Sets the os property value. Operating system.
     * @param value Value to set for the os property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOs(@javax.annotation.Nullable final String value) {
        this._os = value;
    }
    /**
     * Sets the osVersion property value. Operating system version.
     * @param value Value to set for the osVersion property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOsVersion(@javax.annotation.Nullable final String value) {
        this._osVersion = value;
    }
}
