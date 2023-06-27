package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Mobile App Intent and Install State for a given device.
 */
public class MobileAppIntentAndStateDetail implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * MobieApp identifier.
     */
    private String applicationId;
    /**
     * The admin provided or imported title of the app.
     */
    private String displayName;
    /**
     * Human readable version of the application
     */
    private String displayVersion;
    /**
     * A list of possible states for application status on an individual device. When devices contact the Intune service and find targeted application enforcement intent, the status of the enforcement is recorded and becomes accessible in the Graph API. Since the application status is identified during device interaction with the Intune service, status records do not immediately appear upon application group assignment; it is created only after the assignment is evaluated in the service and devices start receiving the policy during check-ins.
     */
    private ResultantAppState installState;
    /**
     * Indicates the status of the mobile app on the device.
     */
    private MobileAppIntent mobileAppIntent;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * The supported platforms for the app.
     */
    private java.util.List<MobileAppSupportedDeviceType> supportedDeviceTypes;
    /**
     * Instantiates a new mobileAppIntentAndStateDetail and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public MobileAppIntentAndStateDetail() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a mobileAppIntentAndStateDetail
     */
    @javax.annotation.Nonnull
    public static MobileAppIntentAndStateDetail createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MobileAppIntentAndStateDetail();
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
     * Gets the applicationId property value. MobieApp identifier.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getApplicationId() {
        return this.applicationId;
    }
    /**
     * Gets the displayName property value. The admin provided or imported title of the app.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * Gets the displayVersion property value. Human readable version of the application
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayVersion() {
        return this.displayVersion;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(7);
        deserializerMap.put("applicationId", (n) -> { this.setApplicationId(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("displayVersion", (n) -> { this.setDisplayVersion(n.getStringValue()); });
        deserializerMap.put("installState", (n) -> { this.setInstallState(n.getEnumValue(ResultantAppState.class)); });
        deserializerMap.put("mobileAppIntent", (n) -> { this.setMobileAppIntent(n.getEnumValue(MobileAppIntent.class)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("supportedDeviceTypes", (n) -> { this.setSupportedDeviceTypes(n.getCollectionOfObjectValues(MobileAppSupportedDeviceType::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the installState property value. A list of possible states for application status on an individual device. When devices contact the Intune service and find targeted application enforcement intent, the status of the enforcement is recorded and becomes accessible in the Graph API. Since the application status is identified during device interaction with the Intune service, status records do not immediately appear upon application group assignment; it is created only after the assignment is evaluated in the service and devices start receiving the policy during check-ins.
     * @return a ResultantAppState
     */
    @javax.annotation.Nullable
    public ResultantAppState getInstallState() {
        return this.installState;
    }
    /**
     * Gets the mobileAppIntent property value. Indicates the status of the mobile app on the device.
     * @return a MobileAppIntent
     */
    @javax.annotation.Nullable
    public MobileAppIntent getMobileAppIntent() {
        return this.mobileAppIntent;
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
     * Gets the supportedDeviceTypes property value. The supported platforms for the app.
     * @return a mobileAppSupportedDeviceType
     */
    @javax.annotation.Nullable
    public java.util.List<MobileAppSupportedDeviceType> getSupportedDeviceTypes() {
        return this.supportedDeviceTypes;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("applicationId", this.getApplicationId());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeStringValue("displayVersion", this.getDisplayVersion());
        writer.writeEnumValue("installState", this.getInstallState());
        writer.writeEnumValue("mobileAppIntent", this.getMobileAppIntent());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeCollectionOfObjectValues("supportedDeviceTypes", this.getSupportedDeviceTypes());
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
     * Sets the applicationId property value. MobieApp identifier.
     * @param value Value to set for the applicationId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setApplicationId(@javax.annotation.Nullable final String value) {
        this.applicationId = value;
    }
    /**
     * Sets the displayName property value. The admin provided or imported title of the app.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the displayVersion property value. Human readable version of the application
     * @param value Value to set for the displayVersion property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayVersion(@javax.annotation.Nullable final String value) {
        this.displayVersion = value;
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
     * Sets the mobileAppIntent property value. Indicates the status of the mobile app on the device.
     * @param value Value to set for the mobileAppIntent property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMobileAppIntent(@javax.annotation.Nullable final MobileAppIntent value) {
        this.mobileAppIntent = value;
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
     * Sets the supportedDeviceTypes property value. The supported platforms for the app.
     * @param value Value to set for the supportedDeviceTypes property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSupportedDeviceTypes(@javax.annotation.Nullable final java.util.List<MobileAppSupportedDeviceType> value) {
        this.supportedDeviceTypes = value;
    }
}
