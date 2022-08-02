package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** AppLogCollectionRequest Entity. */
public class AppLogCollectionRequest extends Entity implements Parsable {
    /** Time at which the upload log request reached a terminal state */
    private OffsetDateTime _completedDateTime;
    /** List of log folders. */
    private java.util.List<String> _customLogFolders;
    /** Error message if any during the upload process */
    private String _errorMessage;
    /** AppLogUploadStatus */
    private AppLogUploadState _status;
    /**
     * Instantiates a new appLogCollectionRequest and sets the default values.
     * @return a void
     */
    public AppLogCollectionRequest() {
        super();
        this.setOdataType("#microsoft.graph.appLogCollectionRequest");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a appLogCollectionRequest
     */
    @javax.annotation.Nonnull
    public static AppLogCollectionRequest createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AppLogCollectionRequest();
    }
    /**
     * Gets the completedDateTime property value. Time at which the upload log request reached a terminal state
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCompletedDateTime() {
        return this._completedDateTime;
    }
    /**
     * Gets the customLogFolders property value. List of log folders.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getCustomLogFolders() {
        return this._customLogFolders;
    }
    /**
     * Gets the errorMessage property value. Error message if any during the upload process
     * @return a string
     */
    @javax.annotation.Nullable
    public String getErrorMessage() {
        return this._errorMessage;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final AppLogCollectionRequest currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("completedDateTime", (n) -> { currentObject.setCompletedDateTime(n.getOffsetDateTimeValue()); });
            this.put("customLogFolders", (n) -> { currentObject.setCustomLogFolders(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("errorMessage", (n) -> { currentObject.setErrorMessage(n.getStringValue()); });
            this.put("status", (n) -> { currentObject.setStatus(n.getEnumValue(AppLogUploadState.class)); });
        }};
    }
    /**
     * Gets the status property value. AppLogUploadStatus
     * @return a appLogUploadState
     */
    @javax.annotation.Nullable
    public AppLogUploadState getStatus() {
        return this._status;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeOffsetDateTimeValue("completedDateTime", this.getCompletedDateTime());
        writer.writeCollectionOfPrimitiveValues("customLogFolders", this.getCustomLogFolders());
        writer.writeStringValue("errorMessage", this.getErrorMessage());
        writer.writeEnumValue("status", this.getStatus());
    }
    /**
     * Sets the completedDateTime property value. Time at which the upload log request reached a terminal state
     * @param value Value to set for the completedDateTime property.
     * @return a void
     */
    public void setCompletedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._completedDateTime = value;
    }
    /**
     * Sets the customLogFolders property value. List of log folders.
     * @param value Value to set for the customLogFolders property.
     * @return a void
     */
    public void setCustomLogFolders(@javax.annotation.Nullable final java.util.List<String> value) {
        this._customLogFolders = value;
    }
    /**
     * Sets the errorMessage property value. Error message if any during the upload process
     * @param value Value to set for the errorMessage property.
     * @return a void
     */
    public void setErrorMessage(@javax.annotation.Nullable final String value) {
        this._errorMessage = value;
    }
    /**
     * Sets the status property value. AppLogUploadStatus
     * @param value Value to set for the status property.
     * @return a void
     */
    public void setStatus(@javax.annotation.Nullable final AppLogUploadState value) {
        this._status = value;
    }
}
