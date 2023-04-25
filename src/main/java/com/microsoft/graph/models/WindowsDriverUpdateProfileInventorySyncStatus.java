package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * A complex type to store the status of a driver and firmware profile inventory sync. The status includes the last successful sync date time and the state of the last sync.
 */
public class WindowsDriverUpdateProfileInventorySyncStatus implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** Windows DnF update inventory sync state. */
    private WindowsDriverUpdateProfileInventorySyncState driverInventorySyncState;
    /** The last successful sync date and time in UTC. */
    private OffsetDateTime lastSuccessfulSyncDateTime;
    /** The OdataType property */
    private String odataType;
    /**
     * Instantiates a new windowsDriverUpdateProfileInventorySyncStatus and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public WindowsDriverUpdateProfileInventorySyncStatus() {
        this.setAdditionalData(new HashMap<>());
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
        return this.additionalData;
    }
    /**
     * Gets the driverInventorySyncState property value. Windows DnF update inventory sync state.
     * @return a windowsDriverUpdateProfileInventorySyncState
     */
    @javax.annotation.Nullable
    public WindowsDriverUpdateProfileInventorySyncState getDriverInventorySyncState() {
        return this.driverInventorySyncState;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("driverInventorySyncState", (n) -> { this.setDriverInventorySyncState(n.getEnumValue(WindowsDriverUpdateProfileInventorySyncState.class)); });
        deserializerMap.put("lastSuccessfulSyncDateTime", (n) -> { this.setLastSuccessfulSyncDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the lastSuccessfulSyncDateTime property value. The last successful sync date and time in UTC.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastSuccessfulSyncDateTime() {
        return this.lastSuccessfulSyncDateTime;
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
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the driverInventorySyncState property value. Windows DnF update inventory sync state.
     * @param value Value to set for the driverInventorySyncState property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDriverInventorySyncState(@javax.annotation.Nullable final WindowsDriverUpdateProfileInventorySyncState value) {
        this.driverInventorySyncState = value;
    }
    /**
     * Sets the lastSuccessfulSyncDateTime property value. The last successful sync date and time in UTC.
     * @param value Value to set for the lastSuccessfulSyncDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastSuccessfulSyncDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.lastSuccessfulSyncDateTime = value;
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
