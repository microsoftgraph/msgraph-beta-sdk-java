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
 * Describes the installation status details of the child app in the context of UPN and device id. This will be deprecated starting May, 2023 (Intune Release 2305). 
 */
public class MobileAppRelationshipState implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** The corresponding device id. */
    private String deviceId;
    /** The error code for install or uninstall failures of target app. */
    private Integer errorCode;
    /** A list of possible states for application status on an individual device. When devices contact the Intune service and find targeted application enforcement intent, the status of the enforcement is recorded and becomes accessible in the Graph API. Since the application status is identified during device interaction with the Intune service, status records do not immediately appear upon application group assignment; it is created only after the assignment is evaluated in the service and devices start receiving the policy during check-ins. */
    private ResultantAppState installState;
    /** Enum indicating additional details regarding why an application has a particular install state. */
    private ResultantAppStateDetail installStateDetail;
    /** The OdataType property */
    private String odataType;
    /** The collection of source mobile app's ids. */
    private java.util.List<String> sourceIds;
    /** The related target app's display name. */
    private String targetDisplayName;
    /** The related target app's id. */
    private String targetId;
    /** The last sync time of the target app. */
    private OffsetDateTime targetLastSyncDateTime;
    /**
     * Instantiates a new mobileAppRelationshipState and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public MobileAppRelationshipState() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a mobileAppRelationshipState
     */
    @javax.annotation.Nonnull
    public static MobileAppRelationshipState createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MobileAppRelationshipState();
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
     * Gets the deviceId property value. The corresponding device id.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDeviceId() {
        return this.deviceId;
    }
    /**
     * Gets the errorCode property value. The error code for install or uninstall failures of target app.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getErrorCode() {
        return this.errorCode;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(9);
        deserializerMap.put("deviceId", (n) -> { this.setDeviceId(n.getStringValue()); });
        deserializerMap.put("errorCode", (n) -> { this.setErrorCode(n.getIntegerValue()); });
        deserializerMap.put("installState", (n) -> { this.setInstallState(n.getEnumValue(ResultantAppState.class)); });
        deserializerMap.put("installStateDetail", (n) -> { this.setInstallStateDetail(n.getEnumValue(ResultantAppStateDetail.class)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("sourceIds", (n) -> { this.setSourceIds(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("targetDisplayName", (n) -> { this.setTargetDisplayName(n.getStringValue()); });
        deserializerMap.put("targetId", (n) -> { this.setTargetId(n.getStringValue()); });
        deserializerMap.put("targetLastSyncDateTime", (n) -> { this.setTargetLastSyncDateTime(n.getOffsetDateTimeValue()); });
        return deserializerMap;
    }
    /**
     * Gets the installState property value. A list of possible states for application status on an individual device. When devices contact the Intune service and find targeted application enforcement intent, the status of the enforcement is recorded and becomes accessible in the Graph API. Since the application status is identified during device interaction with the Intune service, status records do not immediately appear upon application group assignment; it is created only after the assignment is evaluated in the service and devices start receiving the policy during check-ins.
     * @return a resultantAppState
     */
    @javax.annotation.Nullable
    public ResultantAppState getInstallState() {
        return this.installState;
    }
    /**
     * Gets the installStateDetail property value. Enum indicating additional details regarding why an application has a particular install state.
     * @return a resultantAppStateDetail
     */
    @javax.annotation.Nullable
    public ResultantAppStateDetail getInstallStateDetail() {
        return this.installStateDetail;
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
     * Gets the sourceIds property value. The collection of source mobile app's ids.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getSourceIds() {
        return this.sourceIds;
    }
    /**
     * Gets the targetDisplayName property value. The related target app's display name.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTargetDisplayName() {
        return this.targetDisplayName;
    }
    /**
     * Gets the targetId property value. The related target app's id.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTargetId() {
        return this.targetId;
    }
    /**
     * Gets the targetLastSyncDateTime property value. The last sync time of the target app.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getTargetLastSyncDateTime() {
        return this.targetLastSyncDateTime;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("deviceId", this.getDeviceId());
        writer.writeIntegerValue("errorCode", this.getErrorCode());
        writer.writeEnumValue("installState", this.getInstallState());
        writer.writeEnumValue("installStateDetail", this.getInstallStateDetail());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeCollectionOfPrimitiveValues("sourceIds", this.getSourceIds());
        writer.writeStringValue("targetDisplayName", this.getTargetDisplayName());
        writer.writeStringValue("targetId", this.getTargetId());
        writer.writeOffsetDateTimeValue("targetLastSyncDateTime", this.getTargetLastSyncDateTime());
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
     * Sets the deviceId property value. The corresponding device id.
     * @param value Value to set for the deviceId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceId(@javax.annotation.Nullable final String value) {
        this.deviceId = value;
    }
    /**
     * Sets the errorCode property value. The error code for install or uninstall failures of target app.
     * @param value Value to set for the errorCode property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setErrorCode(@javax.annotation.Nullable final Integer value) {
        this.errorCode = value;
    }
    /**
     * Sets the installState property value. A list of possible states for application status on an individual device. When devices contact the Intune service and find targeted application enforcement intent, the status of the enforcement is recorded and becomes accessible in the Graph API. Since the application status is identified during device interaction with the Intune service, status records do not immediately appear upon application group assignment; it is created only after the assignment is evaluated in the service and devices start receiving the policy during check-ins.
     * @param value Value to set for the installState property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setInstallState(@javax.annotation.Nullable final ResultantAppState value) {
        this.installState = value;
    }
    /**
     * Sets the installStateDetail property value. Enum indicating additional details regarding why an application has a particular install state.
     * @param value Value to set for the installStateDetail property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setInstallStateDetail(@javax.annotation.Nullable final ResultantAppStateDetail value) {
        this.installStateDetail = value;
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
    /**
     * Sets the sourceIds property value. The collection of source mobile app's ids.
     * @param value Value to set for the sourceIds property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSourceIds(@javax.annotation.Nullable final java.util.List<String> value) {
        this.sourceIds = value;
    }
    /**
     * Sets the targetDisplayName property value. The related target app's display name.
     * @param value Value to set for the targetDisplayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTargetDisplayName(@javax.annotation.Nullable final String value) {
        this.targetDisplayName = value;
    }
    /**
     * Sets the targetId property value. The related target app's id.
     * @param value Value to set for the targetId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTargetId(@javax.annotation.Nullable final String value) {
        this.targetId = value;
    }
    /**
     * Sets the targetLastSyncDateTime property value. The last sync time of the target app.
     * @param value Value to set for the targetLastSyncDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTargetLastSyncDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.targetLastSyncDateTime = value;
    }
}
