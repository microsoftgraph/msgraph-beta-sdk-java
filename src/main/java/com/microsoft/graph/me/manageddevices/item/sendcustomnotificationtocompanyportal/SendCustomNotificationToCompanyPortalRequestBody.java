package microsoft.graph.me.manageddevices.item.sendcustomnotificationtocompanyportal;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to call the sendCustomNotificationToCompanyPortal method. */
public class SendCustomNotificationToCompanyPortalRequestBody implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The notificationBody property */
    private String _notificationBody;
    /** The notificationTitle property */
    private String _notificationTitle;
    /**
     * Instantiates a new sendCustomNotificationToCompanyPortalRequestBody and sets the default values.
     * @return a void
     */
    public SendCustomNotificationToCompanyPortalRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a sendCustomNotificationToCompanyPortalRequestBody
     */
    @javax.annotation.Nonnull
    public static SendCustomNotificationToCompanyPortalRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SendCustomNotificationToCompanyPortalRequestBody();
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
        final SendCustomNotificationToCompanyPortalRequestBody currentObject = this;
        return new HashMap<>(2) {{
            this.put("notificationBody", (n) -> { currentObject.setNotificationBody(n.getStringValue()); });
            this.put("notificationTitle", (n) -> { currentObject.setNotificationTitle(n.getStringValue()); });
        }};
    }
    /**
     * Gets the notificationBody property value. The notificationBody property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getNotificationBody() {
        return this._notificationBody;
    }
    /**
     * Gets the notificationTitle property value. The notificationTitle property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getNotificationTitle() {
        return this._notificationTitle;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("notificationBody", this.getNotificationBody());
        writer.writeStringValue("notificationTitle", this.getNotificationTitle());
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
     * Sets the notificationBody property value. The notificationBody property
     * @param value Value to set for the notificationBody property.
     * @return a void
     */
    public void setNotificationBody(@javax.annotation.Nullable final String value) {
        this._notificationBody = value;
    }
    /**
     * Sets the notificationTitle property value. The notificationTitle property
     * @param value Value to set for the notificationTitle property.
     * @return a void
     */
    public void setNotificationTitle(@javax.annotation.Nullable final String value) {
        this._notificationTitle = value;
    }
}
