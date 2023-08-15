package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * The Zebra FOTA connector entity that represents the tenant's authorization status for Intune to call Zebra Update Services.
 */
public class ZebraFotaConnector extends Entity implements Parsable {
    /**
     * Complete account enrollment authorization URL. This corresponds to verificationuricomplete in the Zebra API documentations.
     */
    private String enrollmentAuthorizationUrl;
    /**
     * Tenant enrollment token from Zebra. The token is used to enroll Zebra devices in the FOTA Service via app config.
     */
    private String enrollmentToken;
    /**
     * Flag indicating if required Firmware Over-the-Air (FOTA) Apps have been approved.
     */
    private Boolean fotaAppsApproved;
    /**
     * Date and time when the account was last synched with Zebra
     */
    private OffsetDateTime lastSyncDateTime;
    /**
     * Represents various states for Zebra FOTA connector.
     */
    private ZebraFotaConnectorState state;
    /**
     * Instantiates a new zebraFotaConnector and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public ZebraFotaConnector() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a zebraFotaConnector
     */
    @jakarta.annotation.Nonnull
    public static ZebraFotaConnector createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ZebraFotaConnector();
    }
    /**
     * Gets the enrollmentAuthorizationUrl property value. Complete account enrollment authorization URL. This corresponds to verificationuricomplete in the Zebra API documentations.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getEnrollmentAuthorizationUrl() {
        return this.enrollmentAuthorizationUrl;
    }
    /**
     * Gets the enrollmentToken property value. Tenant enrollment token from Zebra. The token is used to enroll Zebra devices in the FOTA Service via app config.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getEnrollmentToken() {
        return this.enrollmentToken;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("enrollmentAuthorizationUrl", (n) -> { this.setEnrollmentAuthorizationUrl(n.getStringValue()); });
        deserializerMap.put("enrollmentToken", (n) -> { this.setEnrollmentToken(n.getStringValue()); });
        deserializerMap.put("fotaAppsApproved", (n) -> { this.setFotaAppsApproved(n.getBooleanValue()); });
        deserializerMap.put("lastSyncDateTime", (n) -> { this.setLastSyncDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("state", (n) -> { this.setState(n.getEnumValue(ZebraFotaConnectorState.class)); });
        return deserializerMap;
    }
    /**
     * Gets the fotaAppsApproved property value. Flag indicating if required Firmware Over-the-Air (FOTA) Apps have been approved.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getFotaAppsApproved() {
        return this.fotaAppsApproved;
    }
    /**
     * Gets the lastSyncDateTime property value. Date and time when the account was last synched with Zebra
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastSyncDateTime() {
        return this.lastSyncDateTime;
    }
    /**
     * Gets the state property value. Represents various states for Zebra FOTA connector.
     * @return a zebraFotaConnectorState
     */
    @jakarta.annotation.Nullable
    public ZebraFotaConnectorState getState() {
        return this.state;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("enrollmentAuthorizationUrl", this.getEnrollmentAuthorizationUrl());
        writer.writeStringValue("enrollmentToken", this.getEnrollmentToken());
        writer.writeBooleanValue("fotaAppsApproved", this.getFotaAppsApproved());
        writer.writeOffsetDateTimeValue("lastSyncDateTime", this.getLastSyncDateTime());
        writer.writeEnumValue("state", this.getState());
    }
    /**
     * Sets the enrollmentAuthorizationUrl property value. Complete account enrollment authorization URL. This corresponds to verificationuricomplete in the Zebra API documentations.
     * @param value Value to set for the enrollmentAuthorizationUrl property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setEnrollmentAuthorizationUrl(@jakarta.annotation.Nullable final String value) {
        this.enrollmentAuthorizationUrl = value;
    }
    /**
     * Sets the enrollmentToken property value. Tenant enrollment token from Zebra. The token is used to enroll Zebra devices in the FOTA Service via app config.
     * @param value Value to set for the enrollmentToken property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setEnrollmentToken(@jakarta.annotation.Nullable final String value) {
        this.enrollmentToken = value;
    }
    /**
     * Sets the fotaAppsApproved property value. Flag indicating if required Firmware Over-the-Air (FOTA) Apps have been approved.
     * @param value Value to set for the fotaAppsApproved property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setFotaAppsApproved(@jakarta.annotation.Nullable final Boolean value) {
        this.fotaAppsApproved = value;
    }
    /**
     * Sets the lastSyncDateTime property value. Date and time when the account was last synched with Zebra
     * @param value Value to set for the lastSyncDateTime property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setLastSyncDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.lastSyncDateTime = value;
    }
    /**
     * Sets the state property value. Represents various states for Zebra FOTA connector.
     * @param value Value to set for the state property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setState(@jakarta.annotation.Nullable final ZebraFotaConnectorState value) {
        this.state = value;
    }
}
