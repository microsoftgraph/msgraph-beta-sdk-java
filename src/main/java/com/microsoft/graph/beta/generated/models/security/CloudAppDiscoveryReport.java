package com.microsoft.graph.beta.models.security;

import com.microsoft.graph.beta.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CloudAppDiscoveryReport extends Entity implements Parsable {
    /**
     * Instantiates a new {@link CloudAppDiscoveryReport} and sets the default values.
     */
    public CloudAppDiscoveryReport() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CloudAppDiscoveryReport}
     */
    @jakarta.annotation.Nonnull
    public static CloudAppDiscoveryReport createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CloudAppDiscoveryReport();
    }
    /**
     * Gets the anonymizeMachineData property value. Use 1 if the machine information is anonymized; otherwise use 0.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getAnonymizeMachineData() {
        return this.backingStore.get("anonymizeMachineData");
    }
    /**
     * Gets the anonymizeUserData property value. Use 1 if the user information is anonymized; otherwise use 0.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getAnonymizeUserData() {
        return this.backingStore.get("anonymizeUserData");
    }
    /**
     * Gets the createdDateTime property value. The date in the format specified. The Timestamp represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.backingStore.get("createdDateTime");
    }
    /**
     * Gets the description property value. A comment or description for the report.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.backingStore.get("description");
    }
    /**
     * Gets the displayName property value. The display name of the continuous report.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("anonymizeMachineData", (n) -> { this.setAnonymizeMachineData(n.getBooleanValue()); });
        deserializerMap.put("anonymizeUserData", (n) -> { this.setAnonymizeUserData(n.getBooleanValue()); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("isSnapshotReport", (n) -> { this.setIsSnapshotReport(n.getBooleanValue()); });
        deserializerMap.put("lastDataReceivedDateTime", (n) -> { this.setLastDataReceivedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("lastModifiedDateTime", (n) -> { this.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("logDataProvider", (n) -> { this.setLogDataProvider(n.getEnumValue(LogDataProvider::forValue)); });
        deserializerMap.put("logFileCount", (n) -> { this.setLogFileCount(n.getIntegerValue()); });
        deserializerMap.put("receiverProtocol", (n) -> { this.setReceiverProtocol(n.getEnumValue(ReceiverProtocol::forValue)); });
        deserializerMap.put("supportedEntityTypes", (n) -> { this.setSupportedEntityTypes(n.getCollectionOfEnumValues(EntityType::forValue)); });
        deserializerMap.put("supportedTrafficTypes", (n) -> { this.setSupportedTrafficTypes(n.getCollectionOfEnumValues(TrafficType::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the isSnapshotReport property value. Use 1 for a snapshot report; otherwise use 0.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsSnapshotReport() {
        return this.backingStore.get("isSnapshotReport");
    }
    /**
     * Gets the lastDataReceivedDateTime property value. The date when the data was last received. The Timestamp represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastDataReceivedDateTime() {
        return this.backingStore.get("lastDataReceivedDateTime");
    }
    /**
     * Gets the lastModifiedDateTime property value. The date when the continuous report was last modified. The Timestamp represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this.backingStore.get("lastModifiedDateTime");
    }
    /**
     * Gets the logDataProvider property value. The applicable log data provider. The possible values are: barracuda, bluecoat, checkpoint, ciscoAsa, ciscoIronportProxy, fortigate, paloAlto, squid, zscaler, mcafeeSwg, ciscoScanSafe, juniperSrx, sophosSg, websenseV75, websenseSiemCef, machineZoneMeraki, squidNative, ciscoFwsm, microsoftIsaW3C, sonicwall, sophosCyberoam, clavister, customParser, juniperSsg, zscalerQradar, juniperSrxSd, juniperSrxWelf, microsoftConditionalAppAccess, ciscoAsaFirepower, genericCef, genericLeef, genericW3C, iFilter, checkpointXml, checkpointSmartViewTracker, barracudaNextGenFw, barracudaNextGenFwWeblog, microsoftDefenderForEndpoint, zscalerCef, sophosXg, iboss, forcepoint, fortios, ciscoIronportWsaIi, paloAltoLeef, forcepointLeef, stormshield, contentkeeper, ciscoIronportWsaIii, checkpointCef, corrata, ciscoFirepowerV6, menloSecurityCef, watchguardXtm, openSystemsSecureWebGateway, wandera, unknownFutureValue.
     * @return a {@link LogDataProvider}
     */
    @jakarta.annotation.Nullable
    public LogDataProvider getLogDataProvider() {
        return this.backingStore.get("logDataProvider");
    }
    /**
     * Gets the logFileCount property value. The count of log files history.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getLogFileCount() {
        return this.backingStore.get("logFileCount");
    }
    /**
     * Gets the receiverProtocol property value. The applicable receiver protocol. The possible values are: ftp, ftps, syslogUdp, syslogTcp, syslogTls, unknownFutureValue.
     * @return a {@link ReceiverProtocol}
     */
    @jakarta.annotation.Nullable
    public ReceiverProtocol getReceiverProtocol() {
        return this.backingStore.get("receiverProtocol");
    }
    /**
     * Gets the supportedEntityTypes property value. The supported entity type. The possible values are: userName, ipAddress, machineName, other, unknown, unknownFutureValue.
     * @return a {@link java.util.List<EntityType>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<EntityType> getSupportedEntityTypes() {
        return this.backingStore.get("supportedEntityTypes");
    }
    /**
     * Gets the supportedTrafficTypes property value. The supported traffic type. The possible values are: downloadedBytes, uploadedBytes, unknown, unknownFutureValue.
     * @return a {@link java.util.List<TrafficType>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<TrafficType> getSupportedTrafficTypes() {
        return this.backingStore.get("supportedTrafficTypes");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeBooleanValue("anonymizeMachineData", this.getAnonymizeMachineData());
        writer.writeBooleanValue("anonymizeUserData", this.getAnonymizeUserData());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeBooleanValue("isSnapshotReport", this.getIsSnapshotReport());
        writer.writeOffsetDateTimeValue("lastDataReceivedDateTime", this.getLastDataReceivedDateTime());
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
        writer.writeEnumValue("logDataProvider", this.getLogDataProvider());
        writer.writeIntegerValue("logFileCount", this.getLogFileCount());
        writer.writeEnumValue("receiverProtocol", this.getReceiverProtocol());
        writer.writeCollectionOfEnumValues("supportedEntityTypes", this.getSupportedEntityTypes());
        writer.writeCollectionOfEnumValues("supportedTrafficTypes", this.getSupportedTrafficTypes());
    }
    /**
     * Sets the anonymizeMachineData property value. Use 1 if the machine information is anonymized; otherwise use 0.
     * @param value Value to set for the anonymizeMachineData property.
     */
    public void setAnonymizeMachineData(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("anonymizeMachineData", value);
    }
    /**
     * Sets the anonymizeUserData property value. Use 1 if the user information is anonymized; otherwise use 0.
     * @param value Value to set for the anonymizeUserData property.
     */
    public void setAnonymizeUserData(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("anonymizeUserData", value);
    }
    /**
     * Sets the createdDateTime property value. The date in the format specified. The Timestamp represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("createdDateTime", value);
    }
    /**
     * Sets the description property value. A comment or description for the report.
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("description", value);
    }
    /**
     * Sets the displayName property value. The display name of the continuous report.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the isSnapshotReport property value. Use 1 for a snapshot report; otherwise use 0.
     * @param value Value to set for the isSnapshotReport property.
     */
    public void setIsSnapshotReport(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isSnapshotReport", value);
    }
    /**
     * Sets the lastDataReceivedDateTime property value. The date when the data was last received. The Timestamp represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the lastDataReceivedDateTime property.
     */
    public void setLastDataReceivedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastDataReceivedDateTime", value);
    }
    /**
     * Sets the lastModifiedDateTime property value. The date when the continuous report was last modified. The Timestamp represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the lastModifiedDateTime property.
     */
    public void setLastModifiedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastModifiedDateTime", value);
    }
    /**
     * Sets the logDataProvider property value. The applicable log data provider. The possible values are: barracuda, bluecoat, checkpoint, ciscoAsa, ciscoIronportProxy, fortigate, paloAlto, squid, zscaler, mcafeeSwg, ciscoScanSafe, juniperSrx, sophosSg, websenseV75, websenseSiemCef, machineZoneMeraki, squidNative, ciscoFwsm, microsoftIsaW3C, sonicwall, sophosCyberoam, clavister, customParser, juniperSsg, zscalerQradar, juniperSrxSd, juniperSrxWelf, microsoftConditionalAppAccess, ciscoAsaFirepower, genericCef, genericLeef, genericW3C, iFilter, checkpointXml, checkpointSmartViewTracker, barracudaNextGenFw, barracudaNextGenFwWeblog, microsoftDefenderForEndpoint, zscalerCef, sophosXg, iboss, forcepoint, fortios, ciscoIronportWsaIi, paloAltoLeef, forcepointLeef, stormshield, contentkeeper, ciscoIronportWsaIii, checkpointCef, corrata, ciscoFirepowerV6, menloSecurityCef, watchguardXtm, openSystemsSecureWebGateway, wandera, unknownFutureValue.
     * @param value Value to set for the logDataProvider property.
     */
    public void setLogDataProvider(@jakarta.annotation.Nullable final LogDataProvider value) {
        this.backingStore.set("logDataProvider", value);
    }
    /**
     * Sets the logFileCount property value. The count of log files history.
     * @param value Value to set for the logFileCount property.
     */
    public void setLogFileCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("logFileCount", value);
    }
    /**
     * Sets the receiverProtocol property value. The applicable receiver protocol. The possible values are: ftp, ftps, syslogUdp, syslogTcp, syslogTls, unknownFutureValue.
     * @param value Value to set for the receiverProtocol property.
     */
    public void setReceiverProtocol(@jakarta.annotation.Nullable final ReceiverProtocol value) {
        this.backingStore.set("receiverProtocol", value);
    }
    /**
     * Sets the supportedEntityTypes property value. The supported entity type. The possible values are: userName, ipAddress, machineName, other, unknown, unknownFutureValue.
     * @param value Value to set for the supportedEntityTypes property.
     */
    public void setSupportedEntityTypes(@jakarta.annotation.Nullable final java.util.List<EntityType> value) {
        this.backingStore.set("supportedEntityTypes", value);
    }
    /**
     * Sets the supportedTrafficTypes property value. The supported traffic type. The possible values are: downloadedBytes, uploadedBytes, unknown, unknownFutureValue.
     * @param value Value to set for the supportedTrafficTypes property.
     */
    public void setSupportedTrafficTypes(@jakarta.annotation.Nullable final java.util.List<TrafficType> value) {
        this.backingStore.set("supportedTrafficTypes", value);
    }
}
