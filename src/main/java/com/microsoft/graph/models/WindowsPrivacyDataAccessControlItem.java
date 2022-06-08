package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Specify access control level per privacy data category */
public class WindowsPrivacyDataAccessControlItem extends Entity implements Parsable {
    /** This indicates an access level for the privacy data category to which the specified application will be given to. Possible values are: notConfigured, forceAllow, forceDeny, userInControl. */
    private WindowsPrivacyDataAccessLevel _accessLevel;
    /** The Package Family Name of a Windows app. When set, the access level applies to the specified application. */
    private String _appDisplayName;
    /** The Package Family Name of a Windows app. When set, the access level applies to the specified application. */
    private String _appPackageFamilyName;
    /** This indicates a privacy data category to which the specific access control will apply. Possible values are: notConfigured, accountInfo, appsRunInBackground, calendar, callHistory, camera, contacts, diagnosticsInfo, email, location, messaging, microphone, motion, notifications, phone, radios, tasks, syncWithDevices, trustedDevices. */
    private WindowsPrivacyDataCategory _dataCategory;
    /**
     * Instantiates a new windowsPrivacyDataAccessControlItem and sets the default values.
     * @return a void
     */
    public WindowsPrivacyDataAccessControlItem() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a windowsPrivacyDataAccessControlItem
     */
    @javax.annotation.Nonnull
    public static WindowsPrivacyDataAccessControlItem createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WindowsPrivacyDataAccessControlItem();
    }
    /**
     * Gets the accessLevel property value. This indicates an access level for the privacy data category to which the specified application will be given to. Possible values are: notConfigured, forceAllow, forceDeny, userInControl.
     * @return a windowsPrivacyDataAccessLevel
     */
    @javax.annotation.Nullable
    public WindowsPrivacyDataAccessLevel getAccessLevel() {
        return this._accessLevel;
    }
    /**
     * Gets the appDisplayName property value. The Package Family Name of a Windows app. When set, the access level applies to the specified application.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAppDisplayName() {
        return this._appDisplayName;
    }
    /**
     * Gets the appPackageFamilyName property value. The Package Family Name of a Windows app. When set, the access level applies to the specified application.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAppPackageFamilyName() {
        return this._appPackageFamilyName;
    }
    /**
     * Gets the dataCategory property value. This indicates a privacy data category to which the specific access control will apply. Possible values are: notConfigured, accountInfo, appsRunInBackground, calendar, callHistory, camera, contacts, diagnosticsInfo, email, location, messaging, microphone, motion, notifications, phone, radios, tasks, syncWithDevices, trustedDevices.
     * @return a windowsPrivacyDataCategory
     */
    @javax.annotation.Nullable
    public WindowsPrivacyDataCategory getDataCategory() {
        return this._dataCategory;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final WindowsPrivacyDataAccessControlItem currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("accessLevel", (n) -> { currentObject.setAccessLevel(n.getEnumValue(WindowsPrivacyDataAccessLevel.class)); });
            this.put("appDisplayName", (n) -> { currentObject.setAppDisplayName(n.getStringValue()); });
            this.put("appPackageFamilyName", (n) -> { currentObject.setAppPackageFamilyName(n.getStringValue()); });
            this.put("dataCategory", (n) -> { currentObject.setDataCategory(n.getEnumValue(WindowsPrivacyDataCategory.class)); });
        }};
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("accessLevel", this.getAccessLevel());
        writer.writeStringValue("appDisplayName", this.getAppDisplayName());
        writer.writeStringValue("appPackageFamilyName", this.getAppPackageFamilyName());
        writer.writeEnumValue("dataCategory", this.getDataCategory());
    }
    /**
     * Sets the accessLevel property value. This indicates an access level for the privacy data category to which the specified application will be given to. Possible values are: notConfigured, forceAllow, forceDeny, userInControl.
     * @param value Value to set for the accessLevel property.
     * @return a void
     */
    public void setAccessLevel(@javax.annotation.Nullable final WindowsPrivacyDataAccessLevel value) {
        this._accessLevel = value;
    }
    /**
     * Sets the appDisplayName property value. The Package Family Name of a Windows app. When set, the access level applies to the specified application.
     * @param value Value to set for the appDisplayName property.
     * @return a void
     */
    public void setAppDisplayName(@javax.annotation.Nullable final String value) {
        this._appDisplayName = value;
    }
    /**
     * Sets the appPackageFamilyName property value. The Package Family Name of a Windows app. When set, the access level applies to the specified application.
     * @param value Value to set for the appPackageFamilyName property.
     * @return a void
     */
    public void setAppPackageFamilyName(@javax.annotation.Nullable final String value) {
        this._appPackageFamilyName = value;
    }
    /**
     * Sets the dataCategory property value. This indicates a privacy data category to which the specific access control will apply. Possible values are: notConfigured, accountInfo, appsRunInBackground, calendar, callHistory, camera, contacts, diagnosticsInfo, email, location, messaging, microphone, motion, notifications, phone, radios, tasks, syncWithDevices, trustedDevices.
     * @param value Value to set for the dataCategory property.
     * @return a void
     */
    public void setDataCategory(@javax.annotation.Nullable final WindowsPrivacyDataCategory value) {
        this._dataCategory = value;
    }
}
