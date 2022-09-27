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
/** Configuration manager client health state */
public class ConfigurationManagerClientHealthState implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Error code for failed state. */
    private Integer _errorCode;
    /** Datetime for last sync with configuration manager management point. */
    private OffsetDateTime _lastSyncDateTime;
    /** The OdataType property */
    private String _odataType;
    /** Configuration manager client state */
    private ConfigurationManagerClientState _state;
    /**
     * Instantiates a new configurationManagerClientHealthState and sets the default values.
     * @return a void
     */
    public ConfigurationManagerClientHealthState() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.configurationManagerClientHealthState");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a configurationManagerClientHealthState
     */
    @javax.annotation.Nonnull
    public static ConfigurationManagerClientHealthState createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ConfigurationManagerClientHealthState();
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
     * Gets the errorCode property value. Error code for failed state.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getErrorCode() {
        return this._errorCode;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final ConfigurationManagerClientHealthState currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(4) {{
            this.put("errorCode", (n) -> { currentObject.setErrorCode(n.getIntegerValue()); });
            this.put("lastSyncDateTime", (n) -> { currentObject.setLastSyncDateTime(n.getOffsetDateTimeValue()); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
            this.put("state", (n) -> { currentObject.setState(n.getEnumValue(ConfigurationManagerClientState.class)); });
        }};
    }
    /**
     * Gets the lastSyncDateTime property value. Datetime for last sync with configuration manager management point.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastSyncDateTime() {
        return this._lastSyncDateTime;
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
     * Gets the state property value. Configuration manager client state
     * @return a configurationManagerClientState
     */
    @javax.annotation.Nullable
    public ConfigurationManagerClientState getState() {
        return this._state;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("errorCode", this.getErrorCode());
        writer.writeOffsetDateTimeValue("lastSyncDateTime", this.getLastSyncDateTime());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeEnumValue("state", this.getState());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the errorCode property value. Error code for failed state.
     * @param value Value to set for the errorCode property.
     * @return a void
     */
    public void setErrorCode(@javax.annotation.Nullable final Integer value) {
        this._errorCode = value;
    }
    /**
     * Sets the lastSyncDateTime property value. Datetime for last sync with configuration manager management point.
     * @param value Value to set for the lastSyncDateTime property.
     * @return a void
     */
    public void setLastSyncDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastSyncDateTime = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
    /**
     * Sets the state property value. Configuration manager client state
     * @param value Value to set for the state property.
     * @return a void
     */
    public void setState(@javax.annotation.Nullable final ConfigurationManagerClientState value) {
        this._state = value;
    }
}
