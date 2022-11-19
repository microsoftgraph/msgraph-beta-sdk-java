package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Enrollment status screen setting */
public class WindowsEnrollmentStatusScreenSettings implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Allow or block user to use device before profile and app installation complete */
    private Boolean _allowDeviceUseBeforeProfileAndAppInstallComplete;
    /** Allow the user to continue using the device on installation failure */
    private Boolean _allowDeviceUseOnInstallFailure;
    /** Allow or block log collection on installation failure */
    private Boolean _allowLogCollectionOnInstallFailure;
    /** Allow the user to retry the setup on installation failure */
    private Boolean _blockDeviceSetupRetryByUser;
    /** Set custom error message to show upon installation failure */
    private String _customErrorMessage;
    /** Show or hide installation progress to user */
    private Boolean _hideInstallationProgress;
    /** Set installation progress timeout in minutes */
    private Integer _installProgressTimeoutInMinutes;
    /** The OdataType property */
    private String _odataType;
    /**
     * Instantiates a new windowsEnrollmentStatusScreenSettings and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public WindowsEnrollmentStatusScreenSettings() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.windowsEnrollmentStatusScreenSettings");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a windowsEnrollmentStatusScreenSettings
     */
    @javax.annotation.Nonnull
    public static WindowsEnrollmentStatusScreenSettings createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WindowsEnrollmentStatusScreenSettings();
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
     * Gets the allowDeviceUseBeforeProfileAndAppInstallComplete property value. Allow or block user to use device before profile and app installation complete
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAllowDeviceUseBeforeProfileAndAppInstallComplete() {
        return this._allowDeviceUseBeforeProfileAndAppInstallComplete;
    }
    /**
     * Gets the allowDeviceUseOnInstallFailure property value. Allow the user to continue using the device on installation failure
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAllowDeviceUseOnInstallFailure() {
        return this._allowDeviceUseOnInstallFailure;
    }
    /**
     * Gets the allowLogCollectionOnInstallFailure property value. Allow or block log collection on installation failure
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAllowLogCollectionOnInstallFailure() {
        return this._allowLogCollectionOnInstallFailure;
    }
    /**
     * Gets the blockDeviceSetupRetryByUser property value. Allow the user to retry the setup on installation failure
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getBlockDeviceSetupRetryByUser() {
        return this._blockDeviceSetupRetryByUser;
    }
    /**
     * Gets the customErrorMessage property value. Set custom error message to show upon installation failure
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCustomErrorMessage() {
        return this._customErrorMessage;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final WindowsEnrollmentStatusScreenSettings currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(8);
        deserializerMap.put("allowDeviceUseBeforeProfileAndAppInstallComplete", (n) -> { currentObject.setAllowDeviceUseBeforeProfileAndAppInstallComplete(n.getBooleanValue()); });
        deserializerMap.put("allowDeviceUseOnInstallFailure", (n) -> { currentObject.setAllowDeviceUseOnInstallFailure(n.getBooleanValue()); });
        deserializerMap.put("allowLogCollectionOnInstallFailure", (n) -> { currentObject.setAllowLogCollectionOnInstallFailure(n.getBooleanValue()); });
        deserializerMap.put("blockDeviceSetupRetryByUser", (n) -> { currentObject.setBlockDeviceSetupRetryByUser(n.getBooleanValue()); });
        deserializerMap.put("customErrorMessage", (n) -> { currentObject.setCustomErrorMessage(n.getStringValue()); });
        deserializerMap.put("hideInstallationProgress", (n) -> { currentObject.setHideInstallationProgress(n.getBooleanValue()); });
        deserializerMap.put("installProgressTimeoutInMinutes", (n) -> { currentObject.setInstallProgressTimeoutInMinutes(n.getIntegerValue()); });
        deserializerMap.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the hideInstallationProgress property value. Show or hide installation progress to user
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getHideInstallationProgress() {
        return this._hideInstallationProgress;
    }
    /**
     * Gets the installProgressTimeoutInMinutes property value. Set installation progress timeout in minutes
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getInstallProgressTimeoutInMinutes() {
        return this._installProgressTimeoutInMinutes;
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
        writer.writeBooleanValue("allowDeviceUseBeforeProfileAndAppInstallComplete", this.getAllowDeviceUseBeforeProfileAndAppInstallComplete());
        writer.writeBooleanValue("allowDeviceUseOnInstallFailure", this.getAllowDeviceUseOnInstallFailure());
        writer.writeBooleanValue("allowLogCollectionOnInstallFailure", this.getAllowLogCollectionOnInstallFailure());
        writer.writeBooleanValue("blockDeviceSetupRetryByUser", this.getBlockDeviceSetupRetryByUser());
        writer.writeStringValue("customErrorMessage", this.getCustomErrorMessage());
        writer.writeBooleanValue("hideInstallationProgress", this.getHideInstallationProgress());
        writer.writeIntegerValue("installProgressTimeoutInMinutes", this.getInstallProgressTimeoutInMinutes());
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
     * Sets the allowDeviceUseBeforeProfileAndAppInstallComplete property value. Allow or block user to use device before profile and app installation complete
     * @param value Value to set for the allowDeviceUseBeforeProfileAndAppInstallComplete property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAllowDeviceUseBeforeProfileAndAppInstallComplete(@javax.annotation.Nullable final Boolean value) {
        this._allowDeviceUseBeforeProfileAndAppInstallComplete = value;
    }
    /**
     * Sets the allowDeviceUseOnInstallFailure property value. Allow the user to continue using the device on installation failure
     * @param value Value to set for the allowDeviceUseOnInstallFailure property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAllowDeviceUseOnInstallFailure(@javax.annotation.Nullable final Boolean value) {
        this._allowDeviceUseOnInstallFailure = value;
    }
    /**
     * Sets the allowLogCollectionOnInstallFailure property value. Allow or block log collection on installation failure
     * @param value Value to set for the allowLogCollectionOnInstallFailure property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAllowLogCollectionOnInstallFailure(@javax.annotation.Nullable final Boolean value) {
        this._allowLogCollectionOnInstallFailure = value;
    }
    /**
     * Sets the blockDeviceSetupRetryByUser property value. Allow the user to retry the setup on installation failure
     * @param value Value to set for the blockDeviceSetupRetryByUser property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBlockDeviceSetupRetryByUser(@javax.annotation.Nullable final Boolean value) {
        this._blockDeviceSetupRetryByUser = value;
    }
    /**
     * Sets the customErrorMessage property value. Set custom error message to show upon installation failure
     * @param value Value to set for the customErrorMessage property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCustomErrorMessage(@javax.annotation.Nullable final String value) {
        this._customErrorMessage = value;
    }
    /**
     * Sets the hideInstallationProgress property value. Show or hide installation progress to user
     * @param value Value to set for the hideInstallationProgress property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setHideInstallationProgress(@javax.annotation.Nullable final Boolean value) {
        this._hideInstallationProgress = value;
    }
    /**
     * Sets the installProgressTimeoutInMinutes property value. Set installation progress timeout in minutes
     * @param value Value to set for the installProgressTimeoutInMinutes property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setInstallProgressTimeoutInMinutes(@javax.annotation.Nullable final Integer value) {
        this._installProgressTimeoutInMinutes = value;
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
