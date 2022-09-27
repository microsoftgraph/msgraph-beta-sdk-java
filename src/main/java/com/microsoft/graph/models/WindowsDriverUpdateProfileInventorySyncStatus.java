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
/** A complex type to store the status of a driver and firmware profile inventory sync. The status includes the last successful sync date time and the state of the last sync. */
public class WindowsDriverUpdateProfileInventorySyncStatus implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Windows DnF update inventory sync state. */
    private WindowsDriverUpdateProfileInventorySyncState _driverInventorySyncState;
    /** The last successful sync date and time in UTC. */
    private OffsetDateTime _lastSuccessfulSyncDateTime;
    /** The OdataType property */
    private String _odataType;
    /**
     * Instantiates a new windowsDriverUpdateProfileInventorySyncStatus and sets the default values.
     * @return a void
     */
    public WindowsDriverUpdateProfileInventorySyncStatus() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.windowsDriverUpdateProfileInventorySyncStatus");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a windowsDriverUpdateProfileInventorySyncStatus
     */
    @javax.annotation.Nonnull
    public static WindowsDriverUpdateProfileInventorySyncStatus createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WindowsDriverUpdateProfileInventorySyncStatus();
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
     * Gets the driverInventorySyncState property value. Windows DnF update inventory sync state.
     * @return a windowsDriverUpdateProfileInventorySyncState
     */
    @javax.annotation.Nullable
    public WindowsDriverUpdateProfileInventorySyncState getDriverInventorySyncState() {
        return this._driverInventorySyncState;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final WindowsDriverUpdateProfileInventorySyncStatus currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(3) {{
            this.put("driverInventorySyncState", (n) -> { currentObject.setDriverInventorySyncState(n.getEnumValue(WindowsDriverUpdateProfileInventorySyncState.class)); });
            this.put("lastSuccessfulSyncDateTime", (n) -> { currentObject.setLastSuccessfulSyncDateTime(n.getOffsetDateTimeValue()); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
        }};
    }
    /**
     * Gets the lastSuccessfulSyncDateTime property value. The last successful sync date and time in UTC.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastSuccessfulSyncDateTime() {
        return this._lastSuccessfulSyncDateTime;
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
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("driverInventorySyncState", this.getDriverInventorySyncState());
        writer.writeOffsetDateTimeValue("lastSuccessfulSyncDateTime", this.getLastSuccessfulSyncDateTime());
        writer.writeStringValue("@odata.type", this.getOdataType());
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
     * Sets the driverInventorySyncState property value. Windows DnF update inventory sync state.
     * @param value Value to set for the driverInventorySyncState property.
     * @return a void
     */
    public void setDriverInventorySyncState(@javax.annotation.Nullable final WindowsDriverUpdateProfileInventorySyncState value) {
        this._driverInventorySyncState = value;
    }
    /**
     * Sets the lastSuccessfulSyncDateTime property value. The last successful sync date and time in UTC.
     * @param value Value to set for the lastSuccessfulSyncDateTime property.
     * @return a void
     */
    public void setLastSuccessfulSyncDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastSuccessfulSyncDateTime = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
}
