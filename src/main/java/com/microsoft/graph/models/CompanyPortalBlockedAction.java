package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Blocked actions on the company portal as per platform and device ownership types */
public class CompanyPortalBlockedAction implements AdditionalDataHolder, Parsable {
    /** Device Action. Possible values are: unknown, remove, reset. */
    private CompanyPortalAction _action;
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Device ownership type. Possible values are: unknown, company, personal. */
    private OwnerType _ownerType;
    /** Device OS/Platform. Possible values are: android, androidForWork, iOS, macOS, windowsPhone81, windows81AndLater, windows10AndLater, androidWorkProfile, unknown. */
    private DevicePlatformType _platform;
    /**
     * Instantiates a new companyPortalBlockedAction and sets the default values.
     * @return a void
     */
    public CompanyPortalBlockedAction() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a companyPortalBlockedAction
     */
    @javax.annotation.Nonnull
    public static CompanyPortalBlockedAction createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CompanyPortalBlockedAction();
    }
    /**
     * Gets the action property value. Device Action. Possible values are: unknown, remove, reset.
     * @return a companyPortalAction
     */
    @javax.annotation.Nullable
    public CompanyPortalAction getAction() {
        return this._action;
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
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final CompanyPortalBlockedAction currentObject = this;
        return new HashMap<>(3) {{
            this.put("action", (n) -> { currentObject.setAction(n.getEnumValue(CompanyPortalAction.class)); });
            this.put("ownerType", (n) -> { currentObject.setOwnerType(n.getEnumValue(OwnerType.class)); });
            this.put("platform", (n) -> { currentObject.setPlatform(n.getEnumValue(DevicePlatformType.class)); });
        }};
    }
    /**
     * Gets the ownerType property value. Device ownership type. Possible values are: unknown, company, personal.
     * @return a ownerType
     */
    @javax.annotation.Nullable
    public OwnerType getOwnerType() {
        return this._ownerType;
    }
    /**
     * Gets the platform property value. Device OS/Platform. Possible values are: android, androidForWork, iOS, macOS, windowsPhone81, windows81AndLater, windows10AndLater, androidWorkProfile, unknown.
     * @return a devicePlatformType
     */
    @javax.annotation.Nullable
    public DevicePlatformType getPlatform() {
        return this._platform;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("action", this.getAction());
        writer.writeEnumValue("ownerType", this.getOwnerType());
        writer.writeEnumValue("platform", this.getPlatform());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the action property value. Device Action. Possible values are: unknown, remove, reset.
     * @param value Value to set for the action property.
     * @return a void
     */
    public void setAction(@javax.annotation.Nullable final CompanyPortalAction value) {
        this._action = value;
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
     * Sets the ownerType property value. Device ownership type. Possible values are: unknown, company, personal.
     * @param value Value to set for the ownerType property.
     * @return a void
     */
    public void setOwnerType(@javax.annotation.Nullable final OwnerType value) {
        this._ownerType = value;
    }
    /**
     * Sets the platform property value. Device OS/Platform. Possible values are: android, androidForWork, iOS, macOS, windowsPhone81, windows81AndLater, windows10AndLater, androidWorkProfile, unknown.
     * @param value Value to set for the platform property.
     * @return a void
     */
    public void setPlatform(@javax.annotation.Nullable final DevicePlatformType value) {
        this._platform = value;
    }
}
