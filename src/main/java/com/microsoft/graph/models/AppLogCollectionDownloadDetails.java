package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AppLogCollectionDownloadDetails implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.  */
    private Map<String, Object> _additionalData;
    /** DecryptionAlgorithm for Content. Possible values are: aes256.  */
    private AppLogDecryptionAlgorithm _appLogDecryptionAlgorithm;
    /** DecryptionKey as string  */
    private String _decryptionKey;
    /** Download SAS Url for completed AppLogUploadRequest  */
    private String _downloadUrl;
    /**
     * Instantiates a new appLogCollectionDownloadDetails and sets the default values.
     * @return a void
     */
    public AppLogCollectionDownloadDetails() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a appLogCollectionDownloadDetails
     */
    @javax.annotation.Nonnull
    public static AppLogCollectionDownloadDetails createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AppLogCollectionDownloadDetails();
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
     * Gets the appLogDecryptionAlgorithm property value. DecryptionAlgorithm for Content. Possible values are: aes256.
     * @return a appLogDecryptionAlgorithm
     */
    @javax.annotation.Nullable
    public AppLogDecryptionAlgorithm getAppLogDecryptionAlgorithm() {
        return this._appLogDecryptionAlgorithm;
    }
    /**
     * Gets the decryptionKey property value. DecryptionKey as string
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDecryptionKey() {
        return this._decryptionKey;
    }
    /**
     * Gets the downloadUrl property value. Download SAS Url for completed AppLogUploadRequest
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDownloadUrl() {
        return this._downloadUrl;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final AppLogCollectionDownloadDetails currentObject = this;
        return new HashMap<>(3) {{
            this.put("appLogDecryptionAlgorithm", (n) -> { currentObject.setAppLogDecryptionAlgorithm(n.getEnumValue(AppLogDecryptionAlgorithm.class)); });
            this.put("decryptionKey", (n) -> { currentObject.setDecryptionKey(n.getStringValue()); });
            this.put("downloadUrl", (n) -> { currentObject.setDownloadUrl(n.getStringValue()); });
        }};
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("appLogDecryptionAlgorithm", this.getAppLogDecryptionAlgorithm());
        writer.writeStringValue("decryptionKey", this.getDecryptionKey());
        writer.writeStringValue("downloadUrl", this.getDownloadUrl());
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
     * Sets the appLogDecryptionAlgorithm property value. DecryptionAlgorithm for Content. Possible values are: aes256.
     * @param value Value to set for the appLogDecryptionAlgorithm property.
     * @return a void
     */
    public void setAppLogDecryptionAlgorithm(@javax.annotation.Nullable final AppLogDecryptionAlgorithm value) {
        this._appLogDecryptionAlgorithm = value;
    }
    /**
     * Sets the decryptionKey property value. DecryptionKey as string
     * @param value Value to set for the decryptionKey property.
     * @return a void
     */
    public void setDecryptionKey(@javax.annotation.Nullable final String value) {
        this._decryptionKey = value;
    }
    /**
     * Sets the downloadUrl property value. Download SAS Url for completed AppLogUploadRequest
     * @param value Value to set for the downloadUrl property.
     * @return a void
     */
    public void setDownloadUrl(@javax.annotation.Nullable final String value) {
        this._downloadUrl = value;
    }
}
