package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ChromeOSOnboardingSettings extends Entity implements Parsable {
    /** The ChromebookTenant's LastDirectorySyncDateTime */
    private OffsetDateTime _lastDirectorySyncDateTime;
    /** The ChromebookTenant's LastModifiedDateTime */
    private OffsetDateTime _lastModifiedDateTime;
    /** The onboarding status of the tenant. */
    private OnboardingStatus _onboardingStatus;
    /** The ChromebookTenant's OwnerUserPrincipalName */
    private String _ownerUserPrincipalName;
    /**
     * Instantiates a new ChromeOSOnboardingSettings and sets the default values.
     * @return a void
     */
    public ChromeOSOnboardingSettings() {
        super();
        this.setOdataType("#microsoft.graph.chromeOSOnboardingSettings");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ChromeOSOnboardingSettings
     */
    @javax.annotation.Nonnull
    public static ChromeOSOnboardingSettings createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ChromeOSOnboardingSettings();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final ChromeOSOnboardingSettings currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("lastDirectorySyncDateTime", (n) -> { currentObject.setLastDirectorySyncDateTime(n.getOffsetDateTimeValue()); });
            this.put("lastModifiedDateTime", (n) -> { currentObject.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
            this.put("onboardingStatus", (n) -> { currentObject.setOnboardingStatus(n.getEnumValue(OnboardingStatus.class)); });
            this.put("ownerUserPrincipalName", (n) -> { currentObject.setOwnerUserPrincipalName(n.getStringValue()); });
        }};
    }
    /**
     * Gets the lastDirectorySyncDateTime property value. The ChromebookTenant's LastDirectorySyncDateTime
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastDirectorySyncDateTime() {
        return this._lastDirectorySyncDateTime;
    }
    /**
     * Gets the lastModifiedDateTime property value. The ChromebookTenant's LastModifiedDateTime
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this._lastModifiedDateTime;
    }
    /**
     * Gets the onboardingStatus property value. The onboarding status of the tenant.
     * @return a onboardingStatus
     */
    @javax.annotation.Nullable
    public OnboardingStatus getOnboardingStatus() {
        return this._onboardingStatus;
    }
    /**
     * Gets the ownerUserPrincipalName property value. The ChromebookTenant's OwnerUserPrincipalName
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOwnerUserPrincipalName() {
        return this._ownerUserPrincipalName;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeOffsetDateTimeValue("lastDirectorySyncDateTime", this.getLastDirectorySyncDateTime());
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
        writer.writeEnumValue("onboardingStatus", this.getOnboardingStatus());
        writer.writeStringValue("ownerUserPrincipalName", this.getOwnerUserPrincipalName());
    }
    /**
     * Sets the lastDirectorySyncDateTime property value. The ChromebookTenant's LastDirectorySyncDateTime
     * @param value Value to set for the lastDirectorySyncDateTime property.
     * @return a void
     */
    public void setLastDirectorySyncDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastDirectorySyncDateTime = value;
    }
    /**
     * Sets the lastModifiedDateTime property value. The ChromebookTenant's LastModifiedDateTime
     * @param value Value to set for the lastModifiedDateTime property.
     * @return a void
     */
    public void setLastModifiedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastModifiedDateTime = value;
    }
    /**
     * Sets the onboardingStatus property value. The onboarding status of the tenant.
     * @param value Value to set for the onboardingStatus property.
     * @return a void
     */
    public void setOnboardingStatus(@javax.annotation.Nullable final OnboardingStatus value) {
        this._onboardingStatus = value;
    }
    /**
     * Sets the ownerUserPrincipalName property value. The ChromebookTenant's OwnerUserPrincipalName
     * @param value Value to set for the ownerUserPrincipalName property.
     * @return a void
     */
    public void setOwnerUserPrincipalName(@javax.annotation.Nullable final String value) {
        this._ownerUserPrincipalName = value;
    }
}
